Good work all around!
Nice interface, smooth operation.

One formatting piece: in PRSMatch2, the setComputerSign() method,
you have nested if statements.  The statements inside the "cheat" 
branch (lines 91-101) should all be indented.  Then the random-selection 
(not cheat) branch should stay exactly where it is, and it will be easy to 
see that it's a different branch entirely.
(-0.2 on the "Style" category).

Thanks for full Javadoc even after I said it wasn't necessary
(+1.0 on "adjustments").

One more consideration for flexibility: consider declaring and using
a private instance variable that you can then use to determine
whether or not to cheat:
private double cheatPct = 0.20;
Then you could easily make changes to the cheating percentage.

Good work overall!
