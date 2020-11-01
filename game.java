package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the first Prophet of Allah?","Who is the last Prophet of Allah?", "What is the name of the Holy book of Muslim"?"};
    String[] options1={"Isa","Yunus","Bible"};
    String[] options2={"Adam","Ismail","Inigila""};
    String[] options3={"Sulaiman","Muhammad","Attaura"};
    String[] options4={"Nuh","Zakariya","Qur'an'"};
    int[] answers={4,3,4};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Welcome keep it up!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Wrong Answer");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
