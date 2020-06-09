
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoExample dd=new DemoExample();
		dd.ParentClass();
		DemoExample dd1=new DemoImplements();
		dd1.ParentClass();
		Polymorphism poly=new Polymorphism();
		poly.reverseString("Poornaiah");
		String reverseString=poly.reverse("Poornaiah");
		System.out.println(reverseString);
		int[]linear= {12,10,5,7,25,45,89,100};
		//System.out.println(poly.linearSearch(linear, 25));
		poly.BinarySearch(linear, 10);
		int xx=poly.reverseNumber(8588);
		System.out.println(xx+" is the reverse number");
		poly.ArrayLeftRotation(linear, 3);
		
	}
	/**
	 * Polindrom number
	 * @param number
	 * @return
	 */
	public int reverseNumber(int number) {
		int temp=number;
		int reverse=0;	
		if(number<10)
			return number;
		while(temp!=0) {
			reverse=reverse*10;
			reverse=reverse+temp%10;
			temp=temp/10;			
		}
		if(number==reverse) 
			System.out.println("Given number is polindrom");
		else
			System.out.println("Given number not polindrom");
		return reverse;
	}
	public void Amostrong(int number) {
		int reverse=0;
		int con;
		int temp=number;
		for(int i=0;i<number;i++) {
			con=number%10;			
			reverse=reverse+(con*con*con);
			number=number/10;
					
		}
		if(temp==number)
			System.out.println(temp+" is Armstrong");
		else
			System.out.println(temp+" is not Armstrong");
			
	}
	/**
	 * Write a string in reverse order.
	 * @param str
	 */
	public void reverseString(String str) {
		String revString="";
		for(int i=str.length()-1;i>=0;i--) {
			revString=revString+str.charAt(i);
		}
		System.out.println(revString);
		
	}
	public String reverse(String str) {
		if(str.isEmpty())
			return "";
		return reverse(str.substring(1))+str.charAt(0);
	}
	public int linearSearch(int[]elements,int search) {
		int find=0;
		for(int i=0;i<elements.length-1;i++) {
			if(elements[i]==search) {
				find=elements[i];
			}
		}
		return find;
	}
	public void BinarySearch(int[]arrayElements,int search) {
		int last=0;
		int first=0;
		int midd=0;
		first=0;
		last=search-1;
		midd=(first+last)/2;
		while(first<=last) {
			if(arrayElements[midd]<search) {
				first=midd+1;
			}else if(arrayElements[midd]==search) {
				System.out.println(search+" found at location "+(midd+1));
				break;
			}else {
				last=midd-1;
			}
			midd=(last+first)/2;
		}
		if(first>last)
		System.out.println(search+" is not found");
		
	}
	public void ArrayLeftRotation(int[]array,int n) {
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
		for(int i=0;i<=n;i++) {
			int j=0;
			int first;
			first=array[0];
			for(j=0;j<array.length-1;j++) {
				array[j]=array[j+1];				
			}
			array[j]=first;
		}
		 System.out.println("   "); 
		 for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" "); 
		 }
	}

}
class DemoExample{
	public void ParentClass() {
		System.out.println("This is parant class method()");
	}
}
class DemoImplements extends DemoExample{
	public void ParentClass() {
		System.out.println("This is child class method()");
	}
}
