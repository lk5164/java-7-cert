package com.exam;

public class Q23
{
	private void a()
	{
	}; // Line 2

	class B
	{ // Line 3
		private void b()
		{
			{ // Line 4
			}
			a();
			{ // Line 5
			}
			{ // Line 6
			}
		}
	} // Line 7

	public static void main(String[] args)
	{
		{ // Line 8
		}
		Q23.B b = new Q23().new B();
		{ // Line 9
			b.b();
			{ // Line 10
			}
			{ // Line 11
			}
		}
	}
}
