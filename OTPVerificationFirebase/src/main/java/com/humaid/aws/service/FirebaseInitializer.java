package com.humaid.aws.service;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;



@Service
public class FirebaseInitializer {
	
	@PostConstruct
	private void initDB() throws IOException 
	{
		
		FileInputStream serviceAccount =
				  new FileInputStream("./serviceAccount.json");

				FirebaseOptions options = new FirebaseOptions.Builder()
				  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
				  .build();

				FirebaseApp.initializeApp(options);
						
		
		
		
	}//initDB
	
	
	
}
