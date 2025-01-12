package m


show = { println it }
square_root = { Math.sqrt(it) }

please = { showClosure ->
	[the: { actionClosure ->
			[of: { n ->
					showClosure(actionClosure(n))
				}]
		}]
}




please show the square_root of 121




//please(show)['the'](square_root)['of'](144)
//please(show).the(square_root).of(9)
























// please(show).the(square_root).of(100)

// please(show)['the'](square_root)['of'](81)

