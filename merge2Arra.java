public class merge2Arra{
	public static void main(String[] args) {
		int b[] = {1,3,5,11,17};
		int a[] = {2,8,10,12,14};
		//int aindex=0,bindex=0;
		int c[] = new int[a.length+b.length];
		int aIndex = 0;
		int bIndex = 0;
		
		//compare frst low
		//boolean flag = false;
		if(a[0]<b[0]){
			c[0] = a[0];
			 aIndex = 1;
			 bIndex = 0;
			//flag = true;
		}
		else{
			c[0] = b[0];
			 aIndex = 0;
			 bIndex = 1;
		}
		//System.out.println(c[0]);
		int cIndex = 1;
		//if flag is true it strts from a array
		
			

			while(aIndex<a.length&&bIndex<b.length){
				if(a[aIndex]<b[bIndex]){
					c[cIndex++] = a[aIndex++];
				}
				else
					c[cIndex++] = b[bIndex++];
			}
			while(aIndex<a.length){
				c[cIndex++] = a[aIndex++];
			}
			while(bIndex<b.length){
				c[cIndex++] = b[bIndex++];
			}

		
		// for(int i:c){
		// 	System.out.print(i+" ");
		// }
			//find median
			//size of array c
			int size = c.length;
			float median = 0.0f;
			if(size%2==0){
				System.out.println(c[size/2]+" "+c[(size/2)-1]);
				median = (float)(c[size/2]+c[(size/2)-1])/2;
			}
			else
				{median = (float)(c[size/2])/2;}
			System.out.println(median);
	}
}