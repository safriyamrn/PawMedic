package com.example.paymentpawmedic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph
import com.example.paymentpawmedic.presentation.beranda.HomeScreen
import com.example.paymentpawmedic.presentation.beranda.MainActivity
import com.example.paymentpawmedic.presentation.onboarding.OnBoardingScreen
import com.example.paymentpawmedic.presentation.onboarding.components.OnBoardingPage
import com.example.paymentpawmedic.ui.theme.PaymentPawMedicTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat. setDecorFitsSystemWindows(window,false)
        installSplashScreen()

        lifecycleScope.launch {

        }

        setContent {
            PaymentPawMedicTheme {
                OnBoardingScreen()
                
                val isSystemInDarkMode = isSystemInDarkTheme()
                
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)){
                }

            }

            }
        }
    }

