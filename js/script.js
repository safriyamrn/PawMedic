
 // Menampilkan formulir pemesanan
 function tampilkanFormulir() {
  var form = document.getElementById("orderForm");
  form.style.display = "block";

  var tombolPesan = document.getElementById("pesanButton");
  if (tombolPesan) {
      tombolPesan.style.display = "none"; // Menonaktifkan tombol setelah diklik
}
 }

function submitForm(event) {
  event.preventDefault(); // Mencegah pengiriman formulir yang default


// -------------- FUNCTION SHOPPING CART ----------------
  var shoppingCart = [];

  function addToCart(productName) {
      shoppingCart.push(productName);
      alert('Product added to cart: ' + productName);
  } 
// }

// function saveToFile() {
//     var nama = document.getElementById("nama").value;
//     var alamat = document.getElementById("alamat").value;
//     var telepon = document.getElementById("telepon").value;
//     var tanggalPemesanan = document.getElementById("tanggalJanji").value;
//     var jenisPelayanan = document.getElementById("jenisPelayanan").value;

//     var content = `Nama: ${nama}\nAlamat: ${alamat}\nTelepon: ${telepon}\nTanggal Janji: ${tanggalJanji}\nJenis Pelayanan: ${jenisPelayanan}`;

//     var blob = new Blob([content], { type: "text/plain" });
//     var url = URL.createObjectURL(blob);

//     var a = document.createElement("a");
//     a.href = url;
//     a.download = "input.txt";
//     a.textContent = "Download File";

//     document.body.appendChild(a);
//     a.click();

//     document.body.removeChild(a);
//     URL.revokeObjectURL(url);

  // Mendapatkan nilai dari formulir
  var nama = document.getElementById("nama").value;
  var alamat = document.getElementById("alamat").value;
  var telepon = document.getElementById("telepon").value;
  var tanggalPemesanan = document.getElementById("tanggalJanji").value;
  var jenisPelayanan = document.getElementById("jenisPelayanan").value;

  // Lakukan sesuatu dengan nilai formulir (misalnya, kirim ke server atau tampilkan pesan)
  alert("Terima kasih, " + nama + "! Pemesanan Anda untuk " + jenisPelayanan + " berhasil diterima.");

  // Menampilkan nilai formulir pada console log
  console.log("Nama: " + nama);
  console.log("Alamat: " + alamat);
  console.log("Telepon: " + telepon);
  console.log("Tanggal Pemesanan: " + tanggalPemesanan);
  console.log("Jenis Pelayanan: " + jenisPelayanan);

//   // // Menampilkan nilai formulir dalam bentuk tabel pada console log
//   // console.table ([{ Nama: nama, Alamat: alamat, Telepon: telepon, Tanggal_Pemesanan: tanggalPemesanan, Jenis_Pelayanan: jenisPelayanan }]);

  // Mereset nilai formulir setelah submit
  document.getElementById("nama").value = "";
  document.getElementById("alamat").value = "";
  document.getElementById("telepon").value = "";
  document.getElementById("tanggalJanji").value = "";
  document.getElementById("jenisPelayanan").value = "";

//   // Requiring fs module in which 
// // readFile function is defined.
// // const fs = require('fs');

// // fs.readFile('input.txt', (err, data) => {
// // if (err) throw err;

// // console.log(data.toString());
// // });

}


