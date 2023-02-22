package uz.oydinbek.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import uz.oydinbek.registration.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.loginButton.setOnClickListener(v -> {
            if (binding.email.getText().length()<3){
                Toast.makeText(this, "Isim eng kamida 3 ta xarf bo'lishi kerak", Toast.LENGTH_SHORT).show();
            }else
                if ( binding.editPassword.getText().length()<6){
                    Toast.makeText(this, "Parol kamida 6 ta harf va belgidan iborat bo'lsin", Toast.LENGTH_SHORT).show();
                }
                else 
                    if (binding.tel.getText().length()<9){
                        Toast.makeText(this, "Raqam noto'g'ri kiritilgan", Toast.LENGTH_SHORT).show();
                    }
                else{
                    Toast.makeText(this, "Kirish muvofaqiyatli yakunlandi", Toast.LENGTH_SHORT).show();
                }
                


        });


    }
}