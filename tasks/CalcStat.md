Description

Calc Stats:

Your task is to process a sequence of integer numbers
to determine the following statistics:

    o) minimum value
    o) maximum value
    o) number of elements in the sequence
    o) average value

For example: [6, 9, 15, -2, 92, 11]

    o) minimum value = -2
    o) maximum value = 92
    o) number of elements in the sequence = 6
    o) average value = 18.166666
    
Tasks:

    1) the sequence contains 1 number [3min] [5min34s]
        - input [1], return "1 1 1 1.0"
        - input [-1], return "-1 -1 1 -1.0" 
    2) the sequence contains 2 nubers [5min] [2min28s]
        - input [-1, 1], return "1 -1 2 0.0"
        - input [27, 2], return "27 2 2 14.5"
    3) the sequence contains more than 2 numbers [5min] [3min20s]
        - input [-2, 17, 0, 101, 34], return "101 -2 5 30.0"
