						package practice_assignment1.question1;
						
						import java.util.Scanner;
						
						public class MaxOf3Num {
							//Find the maximum among three numbers.
							public static void main(String[] args) {
						
								int a = 3;
								int b = 2;
								int c = 8;
								if (a > b && b > c) {
									System.out.println(a);
								} else if (b > a && b > c) {
									System.out.println(b);
								} else {
									System.out.println(c);
								}
							}
						}
