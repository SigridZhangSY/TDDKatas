Description:

The Bowling Game Kata (via Uncle Bob)

The game consists of 10 frames as shown above.  In each frame the player has
two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll.  So in frame 3
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the
number of pins knocked down on the next roll.)

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame.  However no more than three balls can be rolled in
tenth frame.

- Create a new project or start in the existing project by adding Game.cs and TestGame.cs
- Create two public methods methods [refer to the presentation file]
- Create Test Methods for the above Methods
- This is called a 'RED' Test as it is going to fail.
- Rectified both test and class methods
- Write new test
- This is called a 'Green' Test as it is going to pass.
- Rectified TestMethods to meet total 20 frames hit.
- Rectified test to accept multiple frame and pins
- Test 3 is a 'Red' test
- Test 4 and 5 are 'Green'
- All test passed
- Still there is scope of refactoring

Tasks:

      1. knock down 0 pin [3min][2min4s]
          - roll(0) for 20 times, score 0
      2. knock down more than 0 pin without bonus [3min][1min30s]
          - roll(1) for 20 times, score 20
      3. knock down more than 0 pin with a spare before the 10th frame [7min][8min47s]
          - roll(4), roll(6), roll(1), roll(1), roll(0) for 16 times, score 13
      4. knock down more than 0 pin with a strike before the 10th frame [5min][6min57s]
          - roll(10), roll(3), roll(4), roll(0) for 17 times, score 24
      5. knock down more than 0 pin with a spare in the 10th frame [5min][2min13s]
          - roll(0) for 18 times, roll(4), roll(6), roll(1), score 11
      6. knock down more than 0 pin with a strike in the 10th frame [5min][30s]
          - roll(0) for 18 times, roll(10), roll(1), roll(2), score 13
