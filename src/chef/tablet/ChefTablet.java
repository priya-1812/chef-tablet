/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chef.tablet;
import java.util.Scanner;
public class ChefTablet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int n=in.nextInt();
            int b=in.nextInt();
            int max=0;
            for(int i=1;i<=n;i++)
            {
                int w=in.nextInt();
                int h=in.nextInt();
                int p=in.nextInt();
                int area=w*h;
                if(area>max && p<=b)
                {
                    max=area;
                }
            }
            if(max==0)
            {
                System.out.println("No tablet");
            }
            else
            {
                System.out.println(max);
            }
        }
        
        }
        
    
    }
    

