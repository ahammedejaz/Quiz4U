package com.ahammedejaz.quiz4u;


public class QuestionLibrary {
    private String mQuestions[]={
            "1.Full form of OS",
            "2.The ribbon is used in ?",
            "3.Full form of 'DOCOMO'",
            "4.A DNS translate a domain name into what?",
            "5.When was the first E-mail sent?",
            "6.Which of the below is not an Iphone 4 feature?",
            "7.For Reproducing sound the CD audio player uses a?",
            "8.Which company created the most used networking software in 1980's?",
            "9.In which year was the @ chosen for its use in email address?",
            "10.Which American computer company is called BIG BLUE?",
            "11.The IBM PC-XT was the first to include a hard drive. What was the capacity of the disk?",
            "12.In 1983, which person was the first to offer a definition of the term 'Computer Virus'?",
            "13.DTP computer abbreviation usually means?"
    };
    private String mChoices[][]={
            {"Order of Significance","Operating System","Optical Sensor"},
            {"Laser Printer","Plotter","Dot Matrix Printer"},
            {"Do Connect over Mobile","Do Communication Over MobileNetwork","Do Communication or More"},
            {"Binary","Hex","IP"},
            {"1963","1969","1971"},
            {"4G","Multitasking","HD Rec"},
            {"Laser beam","Quartz Crystal","Titanium Needle"},
            {"Microsoft","Novell","Sun"},
            {"1976","1972","1984"},
            {"Microsoft","IBM","SUN"},
            {"750KB","20KB","10KB"},
            {"Smith","Cohen","Nortan"},
            {"DeskTop Publishing","DataType Programming","Digital Transmission Protocol"}
    };
    private String mCorrectAnswers []={"Operating System","Dot Matrix Printer","Do Communication Over MobileNetwork","IP","1971","4G","Laser beam","Novell",
    "1972","IBM","10KB","Cohen","DataType Programming"};

    public String getQuestion(int a){
        String question =mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswers(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }

    }

