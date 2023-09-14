import java.awt.*;
import java.awt.event.*;

class JavaEventProject extends Frame implements ActionListener
{
   String msg=" ";
   String str;
   String mybutton;
   int x, y;
   Label p,q,r,t;
   TextArea v;
   Choice s;
   TextField u;
   Button b;
   JavaEventProject()
   {
     setLayout(new FlowLayout());
     r=new Label("IPCW SOCIETIES", Label.CENTER);
     r.setBackground(Color.lightGray);
     add(r);
     q=new Label("This page will give you short insights of societies that are active in Indraprastha College For Women.",Label.LEFT);
     q.setBackground(Color.lightGray);
     add(q);
     p=new Label("Here is the list of societies",Label.RIGHT);
     p.setBackground(Color.lightGray);
     add(p);
     s=new Choice();
     s.add("Western Music Society");
     s.add("Dramatics Society");
     s.add("Indian Music Society");
     s.add("Fine Art Society ");
     s.add("Indian Dance Society");
     s.add("English Editorial Society");
     s.add("Science Society");
     s.add("Eco Club");
     s.add("Enactus IPCW");
     s.add("Film and Photography Society");
     s.add("Women Development Society");
     s.add("English Debating Society");
     s.add("Career and Guidance Cell");
     s.add("Western Dance Society");
     System.out.println();
     add(s);
     t=new Label("Enter the society you want to explore :",Label.LEFT);
     t.setBackground(Color.lightGray);
     add(t);
     u=new TextField(30);
     add(u);
     u.addActionListener(this);
     v=new TextArea(10,50);
     add(v);
     b=new Button("CLICK THIS BUTTON BEFORE EXIT");
     add(b);
     b.addActionListener(this);
     addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent ae){ 
      System.exit(0);}
     });
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      Object src=ae.getSource();
     if(src == u)
     {
      str=ae.getActionCommand();
      switch(str)
      {
        case "Western Music Society":
            msg="The Western Music Society of Indraprastha College is one of the young societies in the College, as it was formed in 2009.\n" +
                 "Despite being one of the youngest society it has managed to achieve a number of milestones as they have been actively" +
                  "participating "  +
                  "in any music events of not only the college but in the university and beyond.\n" + 
                  "The society has flourished over the years and is considered to be one of the best music societies in the University.\n"+
                  "The Western Music society holds auditions every year to extract fresh talent and " + 
                  "encourage students with musical prowess.\nThe potential that the students have " +
                  "are honed with rigorous workshops which have been fruitful as the students are " +
                  "trained under the guidance of brilliant music teachers in the city true discipline that the Western Classical Music demands."; 
            setBackground(Color.green);
            break;
        case "Dramatics Society":
            msg="Abhivyakti was among the first few dramatics societies of Delhi University.\n" +
                "Founded at the time when women's liberation was a cause of concern, the society performed its very first play on Dowry Issues.\n" +
                 "From then on there has been no looking back.\n" +
                 "This society brings to you a platform to indulge into theatrical activities, both Stage and Street.\n" +
                 "The team uses the art of expression with unmatched enthusiasm to help address the maladies of the society and to form" +
                 "an impetus for the change we wish to see in the world.\nWe bring you awareness in the form of a power-packed combo" +
                 "of eye-opening plays and exuberant performers.\n" +
                 "While Stage gets toyour sentimentality with its beautiful subtlety," + 
                 "Street (or Nukkad) literally gives you a chance to shout your concerns out loud.";

            setBackground(Color.black);
            break;
        case "Indian Music Society":
            msg="Alaap, the Indian music society of the college is actively involved in learning Indian classical music and" +
                 "in encouraging maximum exposure for each of its members through active participation in competitions and events.\n" +
                 "During earlier this year, we conducted auditions to encourage freshers to join the team and so gave them the opportunity" +
                 "to showcase their talent.\nEvery year, we look forward to learning a new composition in Hindustani classical music" +
                 "and hold regular practice sessions so that we perform well in various competitions and events that we go to.\n" +
                 "Last year, we won a lot of appreciation for the performances that we gave in various college events and competitions.\n" + 
                 "This year too, we look forward to a victorious and a successful year ahead.";
            setBackground(Color.blue);
            break;
        case "Fine Art Society":
            msg="We at the fine arts society paint our world out- be it on paper, canvas or any other medium.\n" + 
                "We just need an excuse to get armed with our set of paints and brushes! From decorating the college for" +
                "various events like the college freshers, the annual college festival-Shruti, making Rangolis, doing graffiti" +
                "on the college campus walls, the arts society is a place where one can come and wear their colours on their sleeve.\n" + 
                "Also, the fine arts society is not only caged in the four walls of the college campus.\n" +
                "This year we had participated in the annual cultural festivals organized by IIT Kanpur and IIT Bombay where we bagged" + 
                "the third prize.\n" +
                "Having workshops like that of calligraphy, paper quilling, etc are day-to-day things we keep coming up with in this society.";
            setBackground(Color.cyan);
            break;
        case "Indian Dance Society":
            msg="Mridang is the Indian Classical Dance Society of the college.\nThe society gave its" +
                 "first classical dance performance at the College Fresher’s Day in August, 2013." +
                 "Though it began as a classical dance society, but its domain also largely now" +
                 "covers various folk dances of India.\nFrom Kathak and Odissi to Garba and Lavani," +
                 "the spirit of Indian dance comes alive with this society in 2013-2014.\nMridang" +
                 "prepared its annual production, Dandiya Raas along with the concept of Durga" +
                 "Puja.\nMridang is a very lively and vibrant dance society that performs not just in" +
                 "the competitions but also on various other occasions in the college like the" +
                 "Alumna Day and the Sports Day."; 
            setBackground(Color.magenta);
            break;
        case "English Editorial Society":
            msg="The English Editorial Society is one of the most prominent of the societies of Indraprastha College for Women.\n" +  
                 "The society gives an opportunity to budding writers and poets to express their thoughts and encompasses a" + 
                 "spacious arena wherein the freedom of speech and its expression through writing is most welcomed and encouraged.\n" +
                 "The society keeps organising workshops and writing competitions encouraging students to participate actively.\n" + 
                 "The society has its chief task of taking out the annual college magazine (Aaroh) alongwith the hindi editorial society.\n" + 
                 "The society also organises interesting events during the college annual fest Shruti.";
            setBackground(Color.orange);
            break;
        case "Science Society":
            msg="In the era of rapidly advancing frontiers of Science and Technology, ANANTA- the Science" +
                 "Society of Indraprastha College for Women was launched by Principal Dr. Babli Moitra Saraf on" +
                 "11th October 2018.\nIt has been launched as an academic society which acts as a torch of" +
                 "discovery for the young budding scientists to quench their thirst for knowledge.\nIt was formed as" +
                 "a result of the collective efforts of the five departments namely Computer Science," +
                 "Environmental Studies, Geography, Mathematics and Psychology, as five pillars under the" +
                 "auspices of the society.";
            setBackground(Color.pink);
            break;
        case "Eco Club":
            msg="The Eco-club of College along with its members works on environment related issues and activities.\n" +
                 "The club is in action updates students about various steps and measures that can be taken for the betterment of environment.\n" +
                 "Time to time society organizes different events, tree plantation drives, protest against pollution" +
                 "and marches for various environment related issues.\n" + 
                 "The annual fest PRAKRITI of the society is organized every year in February where workshops on recycling paper," + 
                 "waste management and segregation, etc are included along with different competitive events" + 
                 "such as slogan writing,essay writing,etc.\n" + 
                 "This year we also plan to organize trips to different sanctuaries and parks so that students can enjoy while" +
                 "at the same time they can gain knowledge too.\n" +
                 "We also invite different environmentalists to our college for giving lectures and sharing their views on various" +
                 "environmental issues.";
            setBackground(Color.red);
            break;
        case "Enactus IPCW":
            msg="Enactus, known before October 2012 as SIFE (Students In Free Enterprise), is an international non-profit organization" +
                 "dedicated to using the power of entrepreneurial action to improve the quality of life and standard of" + 
                 "living of people in need.\nGuided by academic advisors and business experts, the student leaders of Enactus" + 
                 "create and implement community empowerment projects around the globe and fulfill the Enactus motto, people, planet, profit" + 
                 "by being environmentally friendly,commercially viable and socially uplifting.";
            setBackground(Color.white);
            break;
        case "Film and Photography Society":
            msg="Simulacra, the Film and Photography society, IP College for women, is a forum for students who are " +
                 "enthusiastic about cinema and photography.\nThe society works towards making students look beyond mainstream" + 
                 "cinema and to appreciate other forms of independent or parallel productions.\nIt provides us with a" +
                 "platform to come together and participate actively in various film-related work.\n" +
                 "We screen films (monthly and/or weekly screenings) from different genres, both Indian and foreign," +
                 "planned according to a particular theme.\nIn the last year, we had Alfred Hitchcock, Jafar Panahi and Tim Burton" +
                 "Retrospectives, and screenings around themes of Sci-fi, Horror, Education, Animation, the constructed Indian Nation, etc." +
                 "We also make sure the student members get a proper opportunity to learn about photography and explore its various dynamics.\n" + 
                 "For this purpose, we have photowalks, which are held once or twice a month.\n" + 
                 "Recently, we had photowalks to Chandni Chowk, Hauz Khas Village and the Delhi University Flower Show.";
            setBackground(Color.yellow);
            break;
        case "Women Development Cell":
            msg="In everyone's life , at sometime , our inner fire goes out.\nIt is then burst into flame by an encounter with another" +
                 "human being .\nWe should all be thankful for those people who rekindle the inner spirit.\n - Albert Schweizwer" +
                 "With this guiding force the Women Development Cell aims at spreading awareness primarily on issues" + 
                 "related to women and most importantly confidence building among them.\n" +
                 "The agenda is as follows:\n" +
                 "Gender sensitization\n" +
                 "Issues like child sexual abuse\n" +
                 "Women assualt/molestation\n" +
                 "Gender bias\n" +
                "Apart from this we basically aim at providing a platform to the members to express themselves eloquently.\n" +
                "Call us 'feminists'...but then who decides what 'feminism' is? We all love being a woman and hence like being called feminists.";
            setBackground(Color.pink);
            break;
        case "English Debating Society":
            msg="The English Debating Society achieved a fair amount of success in the first half of this academic year.\n" +
                 "We started on a promising note, with an orientation, followed by a rigorous selection process resulting in" + 
                 "the addition of an enthusiastic bunch of fresher's to our debating family.\n" + 
                 "Several workshops and mock debate sessions followed, which were taken up by eminent debaters from the" +
                 "University circuit as well as by our society seniors, and through those, we sought to impart training in" +
                 "various forms of debating to further hone our skills.\n" +
                 "The year began with numerous debating events for freshers all over the University.\n" + 
                 "Our students demonstrated remarkable performances in every competition, and made us extremely proud by winning" +
                 "several accolades.\nOn 13th October 2012, we hosted our very own Fresher's Conventional Debate," +
                 "in collaboration with The Hindi Debating Society.\nIt witnessed an overwhelming participation from" + 
                 "colleges across the University and was a huge success, with our members securing top honours at home too.";
            setBackground(Color.orange );
            break;
        case "Career and Guidance Cell":
            msg="The Career Guidance and Placement Cell of the College helps graduating students make" + 
                 "informed choices about their career and the various opportunities in the job market.\n" +
                 "It also seeks to facilitate internship opportunities for existing students to gain work experience" + 
                 "and to explore their aptitude for a given career path.\n" +
                 "The primary focus of the Cell is to proactively seek out for campus placements," +
                 "those companies / organisations that students belonging to different disciplines are interested to join" + 
                 "for final placements/internships.";
            setBackground(Color.magenta);
            break;
        case "Western Dance Society":
            msg="Afroza-THE BURNING FIRE has been known for inculcating some best dancers in the college.\n" + 
                 "The two most important pre-requisites for any Afroza member are unparalleled passion for dance" + 
                 "and a strong commitment towards the team.\n" + 
                 "Yes, the team is a serious business for its core members.\nBut don't get me wrong!!.\n" + 
                 "The team members are focussed when it comes to dancing but they have their moments of fun too.\n" + 
                 "The existing warmth and care that the members have for each other has helped the team to reach the acme of success.\n" +
                 "By the guidance and the rigorous training by our choreographers, Ms. Jaiti Khera and Mr. Rajat Bakshi," +
                 "the team again made it this year by winning laurels for the college.\nIt is because of the hard work of the choreographers" +
                 "that Afroza has managed to keep up its position of being one of the top teams of the Delhi University.";
            setBackground(Color.green);
            break;
    }
    v.setText(msg);
   }
   else
   {
     mybutton="THANKYOU FOR VISITING";
     repaint();
   }
  
  }
    public void paint(Graphics g)
    {
         g.drawString(mybutton,250,400);
    }
    public static void main(String args[])
    {
      JavaEventProject info=new JavaEventProject();
      info.setSize(new Dimension(550,500));
      info.setTitle("IPCW Societies Info");
      info.setVisible(true);
    }
}
     
     
