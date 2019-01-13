#day8
#-Quine in Python
#-Quine is a program which takes no input but outputs a copy of its own code.

_='_=%r;print _%%_';print(_%_)