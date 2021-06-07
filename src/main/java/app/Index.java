package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class Index implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>Homepage</title>";

        // Add some CSS (external file)
        html = html + "<link href='https://fonts.googleapis.com/css?family=Oswald&display=swap' rel='stylesheet' />";
        html = html + "<link href='https://fonts.googleapis.com/css?family=Lato&display=swap' rel='stylesheet' />";
        html = html + "<link href='https://fonts.googleapis.com/css?family=NTR&display=swap' rel='stylesheet' />";
        // Add some CSS (external file)

        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";

        // Add the body
        html = html + "<body class='vb1'>";
    

        // Add HTML for the list of pages
        html = html + "<div class='v7_72'>";
        html = html +    "<div class='v7_102'>  ";
        html = html +    "</div>";

            



            
        html = html +    "<span class='v7_88'>Victoria is the state with the highest number of homeless and at-risk women totalling 57,101 people, approximately 38% of the homeless and at-risk women across Australia in 2018</span>";
        html = html +    "<div class='v7_101'></div>";
            
        html = html +    "<div class='v16_1'>";
                
        html = html +    "</div>";
        html = html +    "<span class='v7_85'>WOMEN</span>";
            
        html = html +    "<div class='v7_82'></div>";
        html = html +    "<span class='v7_95'>LGAs with weekly rent higher than average ($232 in 2018) have a significant increase in elderly homeless and at-risk population approximates 9.27%, while LGAs with lower weekly rent slightly increased by 2.05%.</span>";
        html = html +    "<div class='v7_100'>";

        html = html +    "</div>";
        html = html +    "<div class='v12_0'></div>";
        html = html +    "<span class='v7_94'>ELDERLY</span>";
        html = html +    "<div class='v7_81'></div>";
        html = html +    "<span class='v7_86'>A 34 % of the people experiencing homelessness and at risk of being homeless are under 20 years old, and 43,429 of those are children under 10.</span>";
        html = html +    "<span class='v7_87'>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius, felis non efficitur sollicitudin, purus quam fermentum est, sit amet elementum odio lectus non diam. Morbi eu scelerisque sapien.</span>";
        html = html +    "<div class='v7_93'>";

        html = html +   "</div><div class='v12_2'>";

        html = html +    "</div>";
        html = html +    "<span class='v7_83'>Youth</span>";
        html = html +    "<div class='v8_2'>";
        html = html +       "<div class='v8_3'>";

        html = html +        "</div><div class='v8_4'>";

        html = html +       "</div>";
        html = html +        "<span class='v8_5'><a href='page1.html'>FIND OUT MORE</a></span>";
        html = html +    "</div>";
        html = html +    "<div class='v7_96'>";
        html = html +        "<div class='v7_97'>";

        html = html +        "</div>";
        html = html +        "<div class='v7_98'>";

        html = html +        "</div>";
        html = html +        "<span class='v7_99'><a href='page2.html'>Databank</a></span>";
        html = html +    "</div>";
           
            
            
            

        html = html + "<div class='v7_73'>";
            
        html = html +    "<div class='v7_74'>";
        
        html = html +    "</div>";
        html = html +    "<div class='v7_75'>";
        html = html +    "</div>";
        html = html +    "<div class='v7_76'>";
        html = html + "</div>";
        html = html + "<span class='v7_78'>CONTACT US</span>";
        html = html +   "<span class='v7_79'>DATABANK</span>";
        html = html +    "<span class='v7_80'>HOME FOR US</span>";
        html = html +    "<span class='v7_77'>OUR FOCUS</span>";
        

        html = html + "</div>";

        html = html + "<span class='v7_84'>Three target groups</span>";


        html = html + "<div>";
        html = html +   "<span class='v7_115'>PHONE</span>";
        html = html + "<span class='v7_117'>(03) XXXX XXX</span>";
        html = html + "<span class='v7_111'>Contact </span>";
        html = html + "<span class='v7_112'>Feel free to contact us with any questions.</span>";
        html = html + "<span class='v7_113'>Email</span>";
        html = html + "<span class='v7_116'>email@example.com</span>";
        html = html + "</div>";

        html = html + "<div>";
        html = html + "<span class='v7_106'>CONTACT US</span>";
        html = html + "<span class='v7_110'>HOME FOR US</span>";
        html = html + "<span class='v7_114'>OUR FOCUS</span>";
        html = html + "<span class='v7_103'>A PROJECT OF RMIT STUDENTS</span>";
        html = html + "<span class='v23_0'>FIND OUT MORE</span>";
        html = html + "<span class='v37_27'>DATABANK</span>";
        html = html + "<span class='v7_105'>HOME</span>";
        html = html + "<span class='v7_104'>CONTACT US</span>";
        html = html + "</div>";

    html = html + "</div>";






        // Link for each page
        html = html + "<li> <a href='page1.html'>Page 1</a> </li>";
        html = html + "<li> <a href='page2.html'>Page 2</a> </li>";
        html = html + "<li> <a href='page3.html'>Page 3</a> </li>";
        html = html + "<li> <a href='page4.html'>Page 4</a> </li>";
        html = html + "<li> <a href='page5.html'>Page 5</a> </li>";
        html = html + "<li> <a href='page6.html'>Page 6</a> </li>";

        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
