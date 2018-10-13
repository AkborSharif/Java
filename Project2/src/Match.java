import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Match{
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		String name;
		char gender;
		String birthday;
		String filename = "FullRoster.txt";

			try {
				
				Scanner input = new Scanner ( new FileReader(filename) );
				
				while (input.hasNextLine()) {
					Scanner line = new Scanner(input.nextLine());
					line.useDelimiter("[\t\r]"); 
					name = line.next();
					gender = line.next().charAt(0);
					birthday  = line.next();
					int quietTime = line.nextInt();
					int music = line.nextInt();
					int reading = line.nextInt();
					int chatting = line.nextInt();
					
				   students.add(new Student(name,gender,new Date(birthday),new Preference(quietTime, music, reading, chatting)));
				
				}	
				for ( int i = 0; i< students.size(); i++){
					if (!students.get(i).isMatched()){
						int bestScore = 0;
						int bestMatch = 0;
						for (int j=i+1; j<students.size();j++){
							if(!students.get(j).isMatched()){
								int currentScore = students.get(i).compare(students.get(j));
								if (currentScore > bestScore){
									bestScore = currentScore;
									bestMatch = j;
								}
							}
						}
						if (bestScore != 0){
							students.get(i).setMatched(true);
							students.get(bestMatch).setMatched(true);
							System.out.println(students.get(i).getName() + " matches with " + students.get(bestMatch).getName() + " with the score " + bestScore);
						} else
							if (!students.get(i).isMatched())
								System.out.println(students.get(i).getName() + " has no matches.");
					}
				}
				
				
				input.close();
			} catch ( NoSuchElementException e){
				System.out.println(e);

			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
			
		
			
		}
		
		

	}
