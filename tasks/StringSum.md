Description:
  String Sum KATA
  Write a simple String Sum utility with a function string Sum(string num1, string num2), which can accept only natural numbers and will return their sum. Replace entered number with 0 (zero) if entered number is not a natural number. Stat with a simplest test case with an empty string Create a simple method string Sum(string num1, string num2) Write a test to pass small numbers and refactor, if test passed try to write more code and refactor

Tasks:
1. convert string to number  
    (1) string is empty [estimated time: 5min] [actual time: 4min20s]   
         - input "", return 0
         - input null, return 0
     (2)  thers's at least 1 non-number character in string [5min] [3min10s]
         - input "@#$", return 0
         - input "23$", return 0
         - input "12#45", return 0
  （4）there's no non-number character in string [5min] [1min10s]
         - input "1", return 1
         - input "12", return 12
     (4) string contains only one non-number character which is '+' in the first place [10min] [4min30s]
         - input "+1", return 1
 2. add two numbers and convert the result to String [5min] [3min10s]
         - input "","", return 0
         - input "",null, return 0
         - input "1", "", return 1
         - input "1", "&*", return 1
         - input "1","-2", return 1
         - input "1", "+2", return 3
         - input "1","2", return 3
         - input "1","20", return 21
         - input "11","99", return 110
