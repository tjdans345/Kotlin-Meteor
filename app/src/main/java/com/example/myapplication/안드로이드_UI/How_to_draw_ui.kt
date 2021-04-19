package com.example.myapplication.안드로이드_UI

// 안드로이드에서 화면을 그리는 방법
// - 로직을 작성할 때는 코틀린으로 작성
// - 화면을 그릴때는 -XML을 이용한다
// - XML은 뭘까
//  - DSL Language -> Domain Specific Language
//  - 안드로이드 UI를 그리기 위해 특화된 언어이다

// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?
// - 픽셀, dpi, dp단위
// - 픽셀 -> 핸드폰 화면에서 빛이 나오는 전구 -> 가장 작은 단위
// - dpi -> dot per inch
//      - ldpi -> 120 (1인치에 120픽셀)
//      - mdpi -> 160
//      - hdpi -> 240
//      - xhdpi -> 320
//      - xxhdpi -> 640
//      어느 기종에서든 원하는 UI가 나오게끔 단위를 통일시켜줘야한다
//      - dp -> Density Independent Pixel(픽셀 독립적인 단위)
