package extra;
//13-4-2014
// Original code by Charlotte Hanekamp @ http://pastebin.com/pnZjApsT
// Modified by Thomas Dekker
public class lab32 {
    public static void main(String[] args) {
        int a=1;int b=23;int c=3;int d=42;int e=2;int f=34;int g=45;int h=4;int i=25;int j=5;
        int huidigestaat=1;
        String input="abbb";
        for(int k=0;k<input.length();k++){
            switch(huidigestaat){
                case 1:{
                  if(input.charAt(k)-'a'==0) {
                      huidigestaat=23;}
                  else huidigestaat=1;
                  break;}
 
                case 23:{
                  if(input.charAt(k)-'a'==0) {
                      huidigestaat=3;}
                  else huidigestaat=42;
                  break;}
 
                case 3:{
                  if(input.charAt(k)-'a'==0) {
                      huidigestaat=huidigestaat;}
                  else huidigestaat=2;
                  break;}
 
                case 42:{
                  if(input.charAt(k)-'a'==0) {
                      huidigestaat=34;}
                  else huidigestaat=45;
                  break;}
 
                case 2:{
                  if(input.charAt(k)-'a'==0) {
                      huidigestaat=3;}
                  else huidigestaat=4;
                  break;}
               
                case 34:{
                if(input.charAt(k)-'a'==0) {
                    huidigestaat=4;}
                else huidigestaat=25;
                break;}
               
                case 45:{
                if(input.charAt(k)-'a'==0) {
                    huidigestaat=4;}
                else huidigestaat=5;
                break;}    
               
                case 4:{
                if(input.charAt(k)-'a'==0) {
                    huidigestaat=4;}
                else huidigestaat=5;
                break;}    
                   
                case 25:{
                if(input.charAt(k)-'a'==0) {
                    huidigestaat=3;}
                else huidigestaat=2;
                break;}
                   
                case 5:{
                    huidigestaat=5;
                break;}    
          }}
            if ((huidigestaat==5)||(huidigestaat==25)||(huidigestaat==45)){
                System.out.println("Final state gehaald!");}
            else System.out.println("Final state niet gehaald!");
            System.out.println("Final state: "+huidigestaat);
     
    }
}