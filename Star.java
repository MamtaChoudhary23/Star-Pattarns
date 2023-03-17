1.
*    
**   
***  
**** 
*****


public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0)// Left hand area for backward ***if(j+i<=4 left hand area in forntward )***
								// **
								// *
				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
}


2.
     
     
*****
     
    
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
    for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) // vertical line
				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
  }
}
    
    
    
3.
  *  
  *  
  *  
  *  
  *  
  
  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) // horizantal line
				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
  }
}

  
4.
***  
***  
***  
***  
***  

  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= 2) // horizantal line with left area // **

				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}}}
    
    
5.
  ***
  ***
  ***
  ***
  ***
  
    public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= 2) // horizantal line with right area // **

				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
}}


6.
*****
*****
*****


  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= 2) // vartical line with left area // **

				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}}}
     
     
7.
     
     
*****
*****
*****

  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= 2) // vartical line with right area // **

				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}}}
    
    
8.
*    
**   
***  
**** 
*****
**** 
***  
**   
*    


  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i <= 8 && j - i <= 0) // and condition when both arow are in same direction
				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}}}
    
    
    
9.
*****
**** 
***  
**   
*    
**   
***  
**** 
*****


  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i <= 4 || j - i <= -4) // or condition when both arows are in optiosite direction
				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}}}
    
    
10.

    *    
   ***   
  *****  
 ******* 
*********


  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 9; j++) {
				if (j + i >= 4 && j - i <= 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();

		}}}
    
    
11.

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (j + i >= 4) {
					System.out.print("* "); // between two star give space;
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();

		}}}
    
    
12.

*****    
 ****    
  ***    
   **    
    *    
    **   
    ***  
    **** 
    *****
    
    
      public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				if ((j - i >= 0 && j <= 4) || (j >= 4 && j - i <= 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();

		}
    }
}
    
    
    
13.

*********
 ******* 
  *****  
   ***   
    *    
   ***   
  *****  
 ******* 
*********


  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				if ((j - i >= 0 && j + i <= 8) || (j - i <= 0 && j + i >= 8)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
      }
   }
}
  
  
  
14.

****     
 ****    
  ****   
   ****  
    **** 
   ****  
  ****   
 ****    
****     


public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				if ((j - i >= 0 && j - i <= 3 && i <= 4) || (j + i <= 11 && j + i >= 8 && i > 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
   }
}


15.

    *    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *    
    
    
  public class pattern {

	public static void main(String[] args) {for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				if ((j - i <= 4 && j + i >= 4) && (j - i >= -4 && j + i <= 12)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
          }
			}
			System.out.println();
      }
   }
}



16.

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   
   
   public class pattern {

	public static void main(String[] args) {	for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 5; j++) {
				if (j - i >= -4 && j + i >= 4) {
					System.out.print("* ");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();

		}
}
}