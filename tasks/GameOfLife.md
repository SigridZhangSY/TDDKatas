#Description

Game of Life :

Your task is to write a program to calculate the next
generation of Conway's game of life, given any starting
position. You start with a two dimensional grid of cells,
where each cell is either alive or dead. The grid is finite,
and no life can exist off the edges. When calculating the
next generation of the grid, follow these four rules:

1. Any live cell with fewer than two live neighbours dies,
   as if caused by underpopulation.
2. Any live cell with more than three live neighbours dies,
   as if by overcrowding.
3. Any live cell with two or three live neighbours lives
   on to the next generation.
4. Any dead cell with exactly three live neighbours becomes
   a live cell.

   Examples: * indicates live cell, . indicates dead cell

   Example input: (4 x 8 grid)
    4 8
    ........
    ....*...
    ...**...
    ........


   Example output:
    4 8
    ........
    ...**...
    ...**...
    ........
    
#Tasks

   1. grid is empty [3min][2min47s]
      - input:
        0 0
      - output:
        throws exception "gird is empty"
   2. all cells are died [3min][4min]
      - input:
        3 3
        ...
        ...
        ...
      - output:
        ...
        ...
        ...
   3. calculate the next generation according to rule 1[10min][7min56s]
      - input:
        3 3
        ...
        .*.
        ...
      - output:
        ...
        ...
        ...
   4. calculate the next generation according rule 2 [15min][26min]
      - input:
        3 3
        ..*
        .**
        .**
      - output:
        ..*
        ...
        .**
   5.  calculate the next generation according rule 3 [10min][2min20s]
      - input:
        3 3
        ..*
        .**
        ..*
      - output:
        ..*
        .**
        ..*
   6. calculate the next generation according rule 4 [10min][2min]
      - input:
        3 3
        ..*
        .**
        ...
      - output:
        .**
        .**
        ...
