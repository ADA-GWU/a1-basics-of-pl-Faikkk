The concept of endianness is about the way of storing or transmitting the bytes of a multi-byte data type.In big-endian, the most-significant byte is stored first, while in little-endian we store the least-significant one first. For instance, let’s see how a hexadecimal value 0xFF342109 will be stored at memory locations 0x1000 through 0x1003 in a big-endian and a little-endian system:

Big endian: 
| Address | 0x1000 | 0x1001 | 0x1002 | 0x1003 |
|---------|--------|--------|--------|--------|
| Value   | 0xFF   | 0x34   | 0x21   | 0x09   |

Little endian:
| Address | 0x1000 | 0x1001 | 0x1002 | 0x1003 |
|---------|--------|--------|--------|--------|
| Value   | 0x09   | 0x21   | 0x34   | 0xFF   |

There are use cases for both. Big-endian byte ordering is preferred while sending data over the network. For instance, there is RFC 793 standard,
which requires all the fields in the network headers to be big endian. Little-endian is used in processor architectures, for instance Intel x86.
Little-endian can be slightly more efficient in the arithmethic operations, as these operations are performed starting from the least significant byte.

There are some issues related to endianness, some of which are data misinterpretation and debugging confusion. If there was no agreement on the endianness between the two systems, there is a possibility for one system to misinterpret the data written by another system. Let’s say that one system writes in big-endian, while another reads in little-endian. Another problem occurs is a debugging confusion. Let’s say we want to store the hex value 0xAABBCCDD. Assume that the hardware we are using is little-endian, so it will be stored like 0xDDCCBBAA. When inspecting the memory ourselves during the debugging, we can come up with the latter value and think that there is something wrong. In fact, there is nothing wrong here, as the hardware will automatically apply the endian swap for us when reading the whole value.


From my point of view, the presence of these standards in modern world is more of an historic relic. While one can argue that little-endian has a slight edge in arithmethic operations,
and big-endian is more human readable and thus used in network protocols, I think that there is little point in debating over which one is more preferable, as such details are abstracted away
by the underlying hardware and we will not achieve be a huge difference in performance by choosing either of them.

Resources:
-	https://docs.oracle.com/en/operating-systems/oracle-linux/6/porting/ch03s04.html# 
-	https://www.youtube.com/watch?v=LxvFb63OOs8 

