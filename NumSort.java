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
	
	private static void print(int a[]){//�������
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			}
			System.out.println();
		}

	/*private static void select(int a[]){//ѡ������
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
	  private static void select(int a[]){//���Ч��ѡ������
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
		