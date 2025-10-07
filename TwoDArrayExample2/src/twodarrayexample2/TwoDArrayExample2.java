package twodarrayexample2;

public class TwoDArrayExample2 {

    public static void main(String[] args) {
        char[][] answer= {
            {'D','G','C','C','D','E'},
            {'D','A','G','D','E','B'},
            {'H','G','A','C','D','B'}
    };
        char[] key = {'D','G','C','C','E','B'};
        for(int i=0;i<answer.length; i++){
            int correctAnswer=0;
            for(int j=0; j<answer[i].length; j++){
                if(answer[i][j]==key[j])
                    correctAnswer++;
            }
            System.out.println("Student" +i+ "'s correct answer is: "+ correctAnswer);
        }
    }
    
}
