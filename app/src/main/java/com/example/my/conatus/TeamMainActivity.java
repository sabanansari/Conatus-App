package com.example.my.conatus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TeamMainActivity extends AppCompatActivity {

    List<Team> lstTeam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_main);



        RecyclerView myrv = (RecyclerView)findViewById(R.id.recyclerview_id);



        lstTeam = new ArrayList<>();
        lstTeam.add(new Team("Aditya Pandey","4th Year Coordinator", "Web Developer","A dedicated and hardworking team member.Always there to support the team.",R.drawable.adityasir));
        lstTeam.add(new Team("Amritansh Kr. Yadav","4th Year Coordinator", "Android Developer","Hi, I am Amritansh. I believe in simplicity and hardwork. I am always determined and focused towards my work. I help anyone in need. I am an Android developer and currently doing backend development with laravel.",R.drawable.amritanshsir));
        lstTeam.add(new Team("Ishika Garg","4th Year Coordinator", "Python Developer","I see myself as a brook, which craves its path:not with strength;not with Intelligence, but with consistency. I believe in possessing a pragmatic approach to things. Organized and Driven are my major quirks.",R.drawable.ishikamam));
        lstTeam.add(new Team("Naimish Verma","4th Year Coordinator", "Android Developer","Hi, Naimish here. My life majorly revolves around internet. I majorly work on projects related to mobile and web development. Learning and exploring new technologies is something which I never miss in my free time.",R.drawable.naimishsir));
        lstTeam.add(new Team("Prakhar Agarwal","4th Year Coordinator", "Graphic Designer","I am modest, but hardworking and I consistently sets firm goals for myself. Then,once I've defined the benchmarks, I take the necessary steps to achieve those milestones. Being a creative graphic designer, I would say that I am prolific.",R.drawable.prakharsir));
        lstTeam.add(new Team("Preet Dewan ","4th Year Coordinator", "Android Developer","To code and cook being my forte, I believe in making mistake that gets better with time and eventually teaching myself. Also I have a penchant in web development, with little hand of experience in management domain.",R.drawable.preetmam));
        lstTeam.add(new Team("Rachit Sharma","4th Year Coordinator", "Backend Developer","Passionate wanna be a leader. I'm best at what I do. A dedicated and hard working person who believes in finishing the work effectively as well as efficiently.",R.drawable.rachitsir));
        lstTeam.add(new Team("Ravi Goswami","4th Year Coordinator", "Android Developer","A team player and tries to lead by example.",R.drawable.ravisir));
        lstTeam.add(new Team("Rishabh Bajpai ","4th Year Coordinator", "Graphic Designer","I'm a methodical person and like to keep a positive attitude. I can keep my cool under pressure. Being a Graphic Designer, I love turning great ideas into reality.",R.drawable.rishabhsir));
        lstTeam.add(new Team("Shaily Gupta","4th Year Coordinator", "Android Developer","Integrity and authenticity are important to me. I do what I can, to continue to improve and be the best I can, be at whatever I do. I am someone who has an eye for details because details matter the most.",R.drawable.shailymam));
        lstTeam.add(new Team("Shubhi Rajput","4th Year Coordinator", "Web Developer","An efficient being with good communication skills, managerial ability and positive aura who is confident both in life and at work.",R.drawable.shubhimam));
        lstTeam.add(new Team("Utkarsh Varshney","4th Year Coordinator", "Web Developer","I am modest but hard working and strongly motivated to grow professionally. I consistently set my goals and once I defined the benchmarks, I take needful steps to achieve the milestone.",R.drawable.utkarshsir));
        lstTeam.add(new Team("Adesh Khanna","3rd Year Coordinator", "Web Developer","The more you sweat in practice, the less you bleed in battle, so make your work so strong that even the goal tends to see you winning. This is the only line that is always pumping through my veins and keeping me alive. Due to this aliveness I am what I am today. This is me Adesh Khanna a NodeJS developer.",R.drawable.aadesh));
        lstTeam.add(new Team("Abhinav Srivastava","3rd Year Coordinator", "Android Developer","Be yourself but always your better self. Hey, This is Abhinav Srivastav, a passionate,determined and detail-oriented person. I believe in team work. There are shortcuts for happiness and for me Dancing is one of them. I am currently working to be an Android Developer ",R.drawable.abhinav));
        lstTeam.add(new Team("Arsh Ahmad","3rd Year Coordinator", "Web Developer","I am very much interested and good at learning new things, this habit is related to my profession in a pretty manner because technology is all about learning new things and a person is a developer when he is updated always. I always try to be the best version of myself. I am currently working on web(front-end)technology with angular and looking forward to become a full stack developer.",R.drawable.arsh));
        lstTeam.add(new Team("Ayush Kumar","3rd Year Coordinator", "Designer","I am a designer.",R.drawable.ayush));
        lstTeam.add(new Team("Devanshu Gautam","3rd Year Coordinator", "Python Developer","Engrossed into exploring the world of computer science with profound passion and exuberantly stepping to become a better human. I am thrilled about reading books and playing computer games.",R.drawable.devanshu));
        lstTeam.add(new Team("Ekta Tiwari","3rd Year Coordinator", "Python Developer","An optimistic diligent member of Team Conatus who desires to bring out the best out o herself so that the team could be benefited fron the same. I seek to grab all the opportunities to invigorate the team to a more advanced level with a positive attitude. Working in Machine Learning: Python and learned HTML,CSS,C and C++.",R.drawable.ekta));
        lstTeam.add(new Team("Manvi Srivastava","3rd Year Coordinator", "Web Developer","Life is not about waiting for the storm to pass, It's about learning to dance in rain. Hi, I am Manvi Srivastav, student of Information Technology. I am passionate and I believe in team work. Currently, I am exploring myself in the field of angular to be a web developer with designing skills.",R.drawable.manvi));
        lstTeam.add(new Team("Manya Bhatia","3rd Year Coordinator", "Web Developer","I am an artist who has an eye for anything new. I am a passionate and pragmatic person who never shy away from taking stand. I am working on becoming a web developer and designer.",R.drawable.manya));
        lstTeam.add(new Team("Sayash Chaudhary","3rd Year Coordinator", "Web Developer","I am a person who is hard working and affirmative in what it does. I am a people's person who never shy from taking an initiative. I am Sayash Chaudhary from Team Conatus and is working on angular.",R.drawable.sayash));
        lstTeam.add(new Team("Shaban Ansari","3rd Year Coordinator", "Android Developer","A pacific,passionate and determined hardworking person and also a rhymer of words.My hobbies are singing, writing and sketching. I am currently amplifying my technical skills my learning to develop apps on android platform.",R.drawable.shabanansari));
        lstTeam.add(new Team("Shikhar Agarwal","3rd Year Coordinator", "Web Developer","A profound coder and passionate information technology student who possesses an analytical mind with amicable and positive temperament who faces all the challenges head on. Working as NodeJS developer and having multiple skills like Javascript, Bootstrap, Mongodb, HTML, CSS. ",R.drawable.shikhar));
        lstTeam.add(new Team("Shubhangi Srivastava","3rd Year Coordinator", "Web Developer","I am an avid learner and on the path to explore new things every time. Deeply engrossed into learning new languages. Aiming to create a benchmark for others to follow.",R.drawable.shubhangi));
        lstTeam.add(new Team("Sparsh Gupta","3rd Year Coordinator", "Flutter Developer","A hard working individual who wants to make it to THE SILICON VALLEY, a person with a Big Dream. I am Sparsh Gupta, a Computer Science student who loves hustling. I am a part of Team Conatus, the CS/IT society of our college. I have prior hands on experience in management. I am person who believes in one policy WORK HARD PLAY HARD. I take a lot of pride in the work I do and always try to raise the bar",R.drawable.sparsh));
        lstTeam.add(new Team("Tanya Agarwal","3rd Year Coordinator", "Web Developer","Optimistic approach and a vibrant aura delineate my persona. Striving enthusiastically to excel in the field of computer engineering to manifest my passion for new inventions. Basketball gives me the kick of life.",R.drawable.tanyaagrawal));
        lstTeam.add(new Team("Tanya Srivastava","3rd Year Coordinator", "Web Developer","I am ambitious and driven. I am a realist and yet an optimist. I am a type of person who thinks book are your best friends and is ever ready for something new. I am Tanya Srivastav, a part of Team Conatus working on becoming a web developer.",R.drawable.tanyasri));



        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(TeamMainActivity.this,lstTeam);

        myrv.setLayoutManager(new GridLayoutManager(TeamMainActivity.this, 2));
        myrv.setAdapter(myAdapter);
    }
}

