package com.digitalhouse.desafio_androidcore.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.digitalhouse.desafio_androidcore.R
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    private fun setup() {
//        val imageView: ShapeableImageView = findViewById(R.id.ivRestaurante)
//        val radius = resources.getDimension(R.dimen.default_corner_radius)
//        imageView.shapeAppearanceModel = imageView.shapeAppearanceModel
//            .toBuilder()
//            .setTopRightCorner(CornerFamily.ROUNDED, radius)
//            .build()
//    }
}