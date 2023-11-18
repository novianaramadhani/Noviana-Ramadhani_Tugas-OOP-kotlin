package id.infinitelearning.KotlinSubmission.exercise4


/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

fun main() {

    try {
        // Meminta pengguna memasukkan jumlah ice cream
        print("Berapa banyak ice cream yang ingin Anda beli? =  ")
        val jumlahIceCream = readLine()?.toInt()

        // Periksa apakah jumlah valid
        if (jumlahIceCream != null && jumlahIceCream > 0) {
            // Lakukan operasi pembelian ice cream (di sini kita hanya mencetak pesan)
            println("Pembelian berhasil! Anda telah membeli $jumlahIceCream ice cream.")
        } else {
            // Jika jumlah tidak valid, lemparkan exception
            throw IllegalArgumentException("Jumlah ice cream tidak valid.")
        }
    } catch (e: NumberFormatException) {
        // Tangkap exception jika pengguna memasukkan bukan angka
        println("Error: Masukkan jumlah ice cream dalam bentuk angka.")
    } catch (e: IllegalArgumentException) {
        // Tangkap exception jika jumlah ice cream tidak valid
        println("Error: ${e.message}")
    } catch (e: Exception) {
        // Tangkap exception umum
        println("Terjadi kesalahan: ${e.message}")
    }

}