package com.eloviz.app;

import android.support.v7.app.AppCompatActivity;

/**
 *
 */
public abstract class AMainActivity extends AppCompatActivity {
    public abstract void login(String accessToken, String tokenType, Integer expiresIn, String refreshToken, String login);
    public abstract void login();
}
