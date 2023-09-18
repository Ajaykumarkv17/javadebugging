public class butterflypattern {
    
        public static void main(String[] args) {
            int n=5;
            int l= 2*n-1;
            int a=1,b=l-2;
            for(int i=0;i<l;i++)
            {
    
    
                for(int j=0;j<l;j++)
                {
                    if(i<=4) {
                        if (i % 2 == 0) {
                            String s = ((j % 2 == 0) && ((j <= a) || (j >= b))) ? " * " : "   ";
                            System.out.print(s);
                        } else {
                            String s = ((j % 2 != 0) && ((j <= a) || (j >= b))) ? " * " : "   ";
                            System.out.print(s);
                        }
                    }
                    else
                    {
                        if (i % 2 == 0) {
                            String s = ((j % 2 == 0) && ((j <= a) || (j >= b))) ? " * " : "   ";
                            System.out.print(s);
                        } else {
                            String s = ((j % 2 != 0) && ((j <= a) || (j >= b))) ? " * " : "   ";
                            System.out.print(s);
                        }
    
                    }
    
    
                }
    
    
                if(i<4) {
                    a = a + 1;
                    b = b - 1;
                }
                else
                {
                    a=a-1;
                    b=b+1;
                }
    
    
    
                System.out.println("");
            }
        }
    }
        
        