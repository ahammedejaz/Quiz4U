package com.ahammedejaz.quiz4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();

    private TextView SView;
    private TextView QView;
    private Button choice1;
    private Button choice2;
    private Button choice3;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        SView=(TextView) findViewById(R.id.score);
        QView=(TextView)findViewById(R.id.question);
        choice1=(Button)findViewById(R.id.choice1);
        choice2=(Button)findViewById(R.id.choice2);
        choice3=(Button)findViewById(R.id.choice3);
        updateQuestion();

        //Implementing for Choice1
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice1.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //Implementing for Choice2
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //Implementing for Choice3
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
    }

    private void updateQuestion(){
        QView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        choice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        choice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        choice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer =mQuestionLibrary.getCorrectAnswers(mQuestionNumber);
        mQuestionNumber++;
    }

    private void updateScore(int point){
        SView.setText(""+mScore);
    }
    public void clear(View view) {
        finish();

    }

}


