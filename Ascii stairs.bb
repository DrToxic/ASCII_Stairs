Print "This is a program designed to create ascii stairs."
Print ""
Print "Credit where credit is due:"
Print "Idea: User99672 | Designer: User99672 | Coder: DrToxic"

Repeat
	Print ""
	a$ = Input$ ("Align [L]eft, [R]ight? ")
	b% = Input$ ("Final Width in characters? ")
	c$ = Input$("Step character? ")
	If c$ = "" Then c$ = "|"
	Select Upper(a$)
		Case "L" leftstep(b%,c$)
		Case "R" rightstep(b%,c$)
	End Select
Forever

Function leftstep(b%,c$)
	fs$="_"
	For n=0 To b%
		Print st$
		Print fs$
		st$ = st$+c$+" "
		fs$ = fs$+"__"
	Next
End Function

Function rightstep(b%,c$)
	For n=0 To b-1
		fs$=fs$+"__"
		st$=st$+c$+" "
		rs$ = RSet$(fs$,b%*2)
		rt$ = RSet$(st$,b%*2)
		Print rs$
		Print rt$
	Next
End Function