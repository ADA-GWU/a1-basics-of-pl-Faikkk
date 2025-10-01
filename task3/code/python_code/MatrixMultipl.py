import numpy as np
import time

def main():
    
    print("Enter the size of the first matrix, with a space in-between")
    matrix1_size = list(map(int, input().split(' ')))
    matrix1_row = matrix1_size[0]
    matrix1_col = matrix1_size[1]
    

    print("Enter the size of the second matrix")
    matrix2_size = list(map(int, input().split(' ')))
    matrix2_row = matrix2_size[0]
    matrix2_col = matrix2_size[1]

    if (matrix1_size[0] != matrix2_size[1]):
        print("First matrix's row size must be equal to the second matrix's column size.\n")
        print("Run the program again and enter valid input.")
        return

    matrix1 = np.empty((matrix1_row, matrix1_col))
    matrix2 = np.empty((matrix2_row, matrix2_col))

    print("Now, enter the values for the first matrix, in one line for each row, with space in-between")
    matrix1 = read_matrix(matrix1_row)
        
    print("Now, enter the values for the second matrix, in one line for each row, with space in-between")
    matrix2 = read_matrix(matrix2_row)
    
    execution_start = time.time()
    arr_result = np.dot(matrix1, matrix2)
    
    print(arr_result)
    print(f"The execution time is {(time.time() - execution_start) * 1000} milliseconds")



def read_matrix(row):
        matrix = []
        for j in range(row):
            input_arr = list(map(int, input().split(' ')))
            matrix.append(input_arr)
        return matrix

if __name__ == "__main__":
    main()
    