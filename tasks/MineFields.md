# Description

#### Mine Fields :

```
A field of N x M squares is represented by N lines of
exactly M characters each. The character '*' represents
a mine and the character '.' represents no-mine.

Example input (a 4 x 3 mine-field of 12 squares, 2 of
which are mines)

4 3
*...
..*.
....

Your task is to write a program to accept this input and
produce as output a hint-field of identical dimensions
where each square is a * for a mine or the number of
adjacent mine-squares if the square does not contain a mine.

Example output (for the above input)
*211
12*1
0111
```

# Tasks

1. there's only 1 mine in field [10min] 23min

   - input

     ```
     4 3
     *...
     ....
     ....
     ```


   - output

     ```
     *100
     1100
     0000
     ```

2. there are 2 mines in field [5min] 6min

   - input

     ```
     4 3
     *...
     ..*.
     ....
     ```


   - output

     ```
     *211
     12*1
     0111
     ```

3. there are more than 2 mines in field [5min] 4min

   - input

     ```
     4 3
     *...
     ..*.
     .*..
     ```

   - output

     ```
     *211
     23*1
     1*21
     ```

     ​