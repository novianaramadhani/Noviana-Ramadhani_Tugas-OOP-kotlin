package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Noviana"
    val lastName: String = "Ramadhani"
    val age: Int = 20
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak SIngle"}")
}



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val result = "Group ID: $groupId\nGroup Members: $groupMember\nSession: $session"

    println(result)

    return result
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf("Nidzar", "Novi", "Vionny", "Amel","Sarah")

    // Akses item yang berisi nama Anda
    val myName = groupMembers[1]

    // Jadikan nilai kembalian untuk fungsi myTeam
    return listOf(myName)


}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentors = arrayOf("Kak Raihaan", "Kak fatih", "Kak hasan")
    val countOfGroup = 11

    // Rumus: total mentor + jumlah anggota group
    val total = mentors.size + countOfGroup

    return total
}
fun main() {

    myProfile()




    val myTeam = myTeam()
    println("My name in team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")


    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val groupId = "A_Afternoon_Mobile"
    val groupMembers = listOf("Nidzar", "Novi", "Sarah","Vionny","Amel")
    val session = "Afternoon"

    groupDetail(groupId, groupMembers, session)
//    groupDetail("", listOf(), "")

}