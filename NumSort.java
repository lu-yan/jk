class NumSort{
	public static void main(String[] args){
		int a[] = new int[args.length];
		for(int i=0;i<a.length;i++){
			a[i]=Integer.parseInt(args[i]);
			}
		print(a);
		select(a);
		print(a);
		}
	
	private static void print(int a[]){//输出数组
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			}
			System.out.println();
		}

	/*private static void select(int a[]){//选择排序法
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			  if(a[i]>a[j]){
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					}
				}
			}
	  }*/
	  private static void select(int a[]){//提高效率选择排序法
		  int k;
			int t;
			for(int i=0;i<a.length;i++){
				k=i;
				for(int j=k;j<a.length;j++){
					
				  if(a[k]>a[j]){
						k=j;
					
						}
					}
					if(k!=i){
						t=a[i];
						a[i]=a[k];
						a[k]=t;
					}
				}
		  }
		  
	}
		