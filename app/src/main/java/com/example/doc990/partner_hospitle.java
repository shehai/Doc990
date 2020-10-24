package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class partner_hospitle extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;

    TextView discription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner_hospitle);
        discription =findViewById(R.id.discriptions);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);
        img10=findViewById(R.id.img10);
        img11=findViewById(R.id.img11);
        img12=findViewById(R.id.img12);

        img1.setSelected(true);

        ShowDiscription(img1,"Arogya hospital is all about good health ,preis fully committed to offering the best of health services facilities and has many firsts under its wing towards the contribution of a healthy nation.Since its inception in 1997. Arogya hospitals was the first to accept credit cards form clients ,to introduce e-channeling service and holds the franchise for Osu sala in the Gampaha district. ");
        ShowDiscription(img2,"Asia Hospital Kotte situated in the heart of Sri ospitals chain. Whereas Asia Hospital Mahagama; is a fully-fledged hospital registered with the health department, private hospitals regulatory council and operational since 2008. Asia Hospital has been serving over 8 years as a leading medical hub, earning the trust of patients from all over the area with its strategic pairing technology. ");
        ShowDiscription(img3,"Offering international standards in healthcare, Asiri Central Hospital is a facilities, this 14 story multi-specialty general hospital is a one-stop medical centre that offers diagnostic, therapeutic and intensive care facilities. Asiri Central Hospital is proud of its highly-qualified and experienced consultant specialists who are experts in a diverse range of medical to surgical divisions.  centre facilities");
        ShowDiscription(img4,"Blue Cross Medical Centre has been serving the community’s health care needs  Medical Centre over the years have expanded the services offered to the public keeping abreast with the new technological advances in medical diagnostics and treatment technologies in achieving ‘Information Driven Wellness Management’. Blue Cross Medical Centre has a reputation for continuously investing in its infrastructure to  in medical care.");
        ShowDiscription(img5,"IDental Square is committed in delivering qth modern technology. A full fledge dental practice offering international standards in dental care and located in the heart of Colombo in an easily accessible location at No 6/1, Murugan Place, off Havelock Road, Colombo 06. Dental Square specializes in dental implants from replacing single missing tooth to providing full mouth implant supported teeth. Dr Ayesha Thajudeen,  ");
        ShowDiscription(img6,"Ceymed Healthcare Services (Pvt) Ltd is a mCompanies and has been in operation since June 2001 at 132, S. de S. Jayasinghe Mawatha, Nugegoda, Sri Lanka. A 24 hour outpatient service is managed by Dr Sarath Paranavitane who is a well-known specialist family physician. 'Ceymed' has grown to be a brand name synonymous with reliability, efficiency and accuracy. Ceymed has opened smaller laboratories (Ceylabs) in Ragama, Horana, ");
        ShowDiscription(img7,"IWe, as a Health Care Team at Healthy Life ard in highlighting the significance of Diabetes and its related complications. Diabetes is a pandemic crisis, threatening the Sri Lankan population. Healthy Life offers a holistic approach to help those with Diabetes by means of different packages and membership status that covers your medical needs all through the year.You will be supported by Laboratory services, Pharmacy, ");
        ShowDiscription(img8,"Ninewells Care Mother and Baby Hospital’ d spacious land bordering Kirimandala Mawatha, Colombo-5, records a dignified history of 12 years in the medical field, since its inauguration in the year 2004. It started with a four story building but addition of the 10 story state of the art building in the year 2013 added more glamour and upgrading of services provided by the hospital. Access Group of Companies took.");
        ShowDiscription(img9,"Christell Skin Clinic is f nd usinnologies. We offer a range of skin, hair care and contouring treatments built upon clinically-proven techniques. Christell is spearheaded by Prof. Ramani Arsecularatne and Dr. Shanika Arsecularatne, names that are synonymous with beauty, skin care and caring customer service. Our passion lies in helping you realise your objectives and feel confident with the way you look.");
        ShowDiscription(img10,"Ceylinco Healthcare Services Ltd,as a well experienced and highly qualified panel of consultants. Ceylinco Healthcare Services is also the only cancer treatment centre in the country to offer Tomotherapy treatment which is considered the most advanced radiation treatment for cancer in the world today.");
        ShowDiscription(img11,"The Center for Diabetes Endocrinologysive care for Diabetes, cardiac, renal and metabolic diseases and for those who have developed cardiac, kidney and eye complications under one roof. CDEM is not another channel center, it’s a revolutionized step in comprehensive care in sri lanka. The unique features of this center are that the patients will be provided comprehensive, total and holistic care which includes prevention.");
        ShowDiscription(img12,"Providing the people of southern Sri Lenient access to treatments and services, Asiri Hospital Matara is a fully owned subsidiary of the Asiri Group of Hospitals. Incorporated in 2007, it acquired Matara Medi House (Pvt) Ltd in 2010. It now consists of two hospitals that function as one entity. Asiri Hospital Matara maintains the standard of excellence and care that the Asiri Group is renowned for along with know-how.");










    }

    public void ShowDiscription(ImageView imageView , final String dtext){

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                discription.setText(dtext);
                Log.i("ImageButn","Click button");
            }
        });




    }
}