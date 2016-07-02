# Description

#### Harry Potter :

```
To try and encourage more sales of the 5 different Harry
Potter books they sell, a bookshop has decided to offer
discounts of multiple-book purchases.

One copy of any of the five books costs 8 EUR.

If, however, you buy two different books, you get a 5%
discount on those two books.

If you buy 3 different books, you get a 10% discount.

If you buy 4 different books, you get a 20% discount.

If you go the whole hog, and buy all 5, you get a huge 25%
discount.

Note that if you buy, say, four books, of which 3 are
different titles, you get a 10% discount on the 3 that
form part of a set, but the fourth book still costs 8 EUR.

Your mission is to write a piece of code to calculate the
price of any conceivable shopping basket (containing only
Harry Potter books), giving as big a discount as possible.

For example, how much does this basket of books cost?

2 copies of the first book
2 copies of the second book
2 copies of the third book
1 copy of the fourth book
1 copy of the fifth book

Answer: 51.60 EUR
```

# Tasks

1. just buy 1 book [3min]  1min46s
   - input {1, 0, 0, 0, 0}, return 8
   - input {0, 0, 0, 0 ,0}, return 0
2. buy 5 different books [3min]  2min47s
   - input {1, 1, 1, 1, 1}, return 30
3. buy less than 6 books， each of them is different with others [5min] 9min12s
   - input {1, 1, 1, 1, 0}, return 25.6
   - input {1, 1, 1, 0, 0}, return 21.6
   - input {1, 1, 0, 0, 0}, return 15.2
4. buy books in any way [10min]  9min17s
   - input {2, 2, 2, 1, 1}, return 51.6









(using dynamic programming for a better answer) ？

perfect：1+2+3+4    8X4X0.8 = 25.6

​		 1+2+3+5   8X4X0.8 = 25.6

​					   total : 51.2