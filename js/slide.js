let slideIndex = 1;

function showSlides(n) {
    let i;
    const slides = document.getElementsByClassName("mySlides");
    if (n > slides.length) {
        slideIndex = 1;
    }
    if (n < 1) {
        slideIndex = slides.length;
    }
    for (i = 0; i < slides.length; i++) {
        slides[i].classList.remove("fade"); // Hapus kelas fade dari semua elemen
        slides[i].style.display = "none";
    }
    slides[slideIndex - 1].style.display = "block";
    slides[slideIndex - 1].classList.add("fade"); // Tambahkan kelas fade ke elemen yang aktif
}

function plusSlides(n) {
    showSlides(slideIndex += n);
}

function currentSlide(n) {
    showSlides(slideIndex = n);
}

// Auto slide
let slideInterval;

function startAutoSlide() {
    slideInterval = setInterval(function () {
        plusSlides(1);
    }, 5000); // Ganti angka ini dengan durasi slide yang diinginkan (dalam milidetik)
}

function stopAutoSlide() {
    clearInterval(slideInterval);
}

document.addEventListener("DOMContentLoaded", function () {
    showSlides(slideIndex);
    startAutoSlide();
});

document.addEventListener("visibilitychange", function () {
    if (document.visibilityState === "hidden") {
        stopAutoSlide();
    } else if (document.visibilityState === "visible") {
        startAutoSlide();
    }
});
