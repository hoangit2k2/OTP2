/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap_2;

public class Mymath {

    public int add(int ...x) {
       int count = 0;
       for(int a:x){
           count +=a;
       }
       return count;
    }

    public static void main(String[] args) {
        Mymath abc = new Mymath();
        System.out.println(abc.add(4,5));
        System.out.println(abc.add(4,5,5));
        System.out.println(abc.add(4,4));
        System.out.println(abc.add(1,2,3,4,5,6,7,8,9));
    }
}
