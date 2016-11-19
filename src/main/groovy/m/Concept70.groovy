package m

import static Simple.*


show = { println it }
square_root = { Math.sqrt(it) }








please show the square_root of 81































// please(show).the(square_root).of(100)

class Simple {
	Closure show
	Closure action
	
	static Simple please(Closure show) {
		Simple s = new Simple()
		s.show = show
		return s
	}
	
	Simple the(Closure action) {
		this.action = action
		return this
	}
	
	void of(int n) {
		show(action(n)) 
	}
}
