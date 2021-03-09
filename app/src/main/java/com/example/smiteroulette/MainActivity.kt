package com.example.smiteroulette

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.smiteroulette.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.godName.text="Achilles"
        val startImage: ImageView = findViewById(R.id.god_image)
        val startDrawable = R.drawable.achilles_standard_achilles
        startImage.setImageResource(startDrawable)
        binding.roll.setOnClickListener { getGod() }
        binding.changeWheel.setOnClickListener{ changeWheel()}
    }

    private fun getGod() {
        val seed = (1..113).random()
        val x = godList.mapIndexed { index: Int, s: String -> index + 1 to s }.toMap()
        binding.godName.text = x[seed]
        val godImage: ImageView = findViewById(R.id.god_image)
        val god_drawable = when(x[seed]){
            "Achilles" -> R.drawable.achilles_standard_achilles
            "Agni" -> R.drawable.agni_standard_agni
            "Ah Puch" -> R.drawable.ah_puch_standard_ah_puch
            "Amaterasu" -> R.drawable.amaterasu_standard_amaterasu
            "Ao Kuang"-> R.drawable.ao_kuang_standard_ao_kuang
            "Arachne"-> R.drawable.arachne_standard_arachne
            "Ares"-> R.drawable.ares_standard_ares
            "Artio"-> R.drawable.artio_standard_artio
            "Athena"-> R.drawable.athena_standard_athena
            "Awilix"-> R.drawable.awilix_standard_awilix
            "Bacchus"-> R.drawable.bacchus_standard_bacchus
            "Bakasura"-> R.drawable.bakasura_standard_bakasura
            "Bastet"-> R.drawable.bastet_standard_bastet
            "Bellona"-> R.drawable.bellona_standard_bellona
            "Cabrakan"-> R.drawable.cabrakan_standard_cabrakan
            "Camazotz"-> R.drawable.camazotz_standard_camazotz
            "Cerberus"-> R.drawable.cerberus_standard_cerberus
            "Chaac"-> R.drawable.chaac_standard_chaac
            "Cu Chulainn"-> R.drawable.cu_chulainn_standard_cu_chulainn
            "Da Ji"-> R.drawable.da_ji_standard_daji
            "Erlang Shen"-> R.drawable.erlang_shen_standard_erlang_shen
            "Fafnir"-> R.drawable.fafnir_standard_fafnir
            "Fenrir"-> R.drawable.fenrir_standard_fenrir
            "Freya"-> R.drawable.freya_standard_freya
            "Ganesha"-> R.drawable.ganesha_standard_ganesha
            "Geb" -> R.drawable.geb_standard_geb
            "Guan Yu"-> R.drawable.guan_yu_standard_guan_yu
            "Hercules"-> R.drawable.hercules_standard_hercules
            "Horus"-> R.drawable.horus_standard_horus
            "Hun Batz"-> R.drawable.hun_batz_standard_hun_batz
            "Kali"-> R.drawable.kali_standard_kali
            "Khepri"-> R.drawable.khepri_standard_khepri
            "King Arthur"-> R.drawable.king_arthur_standard_king_arthur
            "Kumbhakarna"-> R.drawable.kumbhakarna_standard_kumbhakarna
            "Kuzenbo"-> R.drawable.kuzenbo_standard_kuzenbo
            "Loki"-> R.drawable.loki_standard_loki
            "Mercury"-> R.drawable.mercury_standard_mercury
            "Mulan"-> R.drawable.mulan_standard_mulan
            "Ne Zha"-> R.drawable.ne_zha_standard_ne_zha
            "Nemesis"-> R.drawable.nemesis_standard_nemesis
            "Nike"-> R.drawable.nike_standard_nike
            "Odin"-> R.drawable.odin_standard_odin
            "Osiris"-> R.drawable.osiris_standard_osiris
            "Pele"-> R.drawable.pele_standard_pele
            "Ratatoskr"-> R.drawable.ratatoskr_standard_ratatoskr
            "Ravana"-> R.drawable.ravana_standard_ravana
            "Serqet"-> R.drawable.serqet_standard_serqet
            "Set"-> R.drawable.set_standard_set
            "Sobek"-> R.drawable.sobek_standard_sobek
            "Sun Wukong"-> R.drawable.sun_wukong_standard_sun_wukong
            "Susano"-> R.drawable.susano_standard_susano
            "Terra"-> R.drawable.terra_standard_terra
            "Thanatos"-> R.drawable.thanatos_standard_thanatos
            "Thor"-> R.drawable.thor_standard_thor
            "Tyr"-> R.drawable.tyr_standard_tyr
            "Vamana"-> R.drawable.vamana_standard_vamana
            "Xing Tian"-> R.drawable.xing_tian_standard_xing_tian
            "Ymir"-> R.drawable.ymir_standard_ymir
            "Ah Muzen Cab"-> R.drawable.ahmuzencab
            "Anhur"-> R.drawable.anhur_standard_anhur
            "Anubis"-> R.drawable.anubis_standard_anubis
            "Aphrodite"-> R.drawable.aphrodite_standard_aphrodite
            "Apollo"-> R.drawable.apollo_standard_apollo
            "Artemis"-> R.drawable.artemis_standard_artemis
            "Baba Yaga"-> R.drawable.baba_yaga_standard_baba_yaga
            "Baron Samedi"-> R.drawable.baron_samedi_standard_baron_samedi
            "Cernunnos"-> R.drawable.cernunnos_standard_cernunnos
            "Chang e"-> R.drawable.change_standard_change
            "Chernobog"-> R.drawable.chernobog_standard_chernobog
            "Chiron"-> R.drawable.chiron_standard_chiron
            "Chronos"-> R.drawable.chronos_standard_chronos
            "Cupid"-> R.drawable.cupid_standard_cupid
            "Discordia"-> R.drawable.discordia_standard_discordia
            "Hachiman"-> R.drawable.hachiman_standard_hachiman
            "Hades"-> R.drawable.hades_standard_hades
            "He Bo"-> R.drawable.he_bo_standard_he_bo
            "Heimdallr"-> R.drawable.heimdallr_standard_heimdallr
            "Hel"-> R.drawable.hel_standard_hel
            "Hera"-> R.drawable.hera_standard_hera
            "Hou Yi"-> R.drawable.hou_yi_standard_hou_yi
            "Isis"-> R.drawable.isis_standard_isis
            "Izanami"-> R.drawable.izanami_standard_izanami
            "Janus"-> R.drawable.janus_standard_janus
            "Jing Wei"-> R.drawable.jing_wei_standard_jing_wei
            "Jormungandr"-> R.drawable.jormungandr_standard_jormungandr
            "Kukulkan"-> R.drawable.kukulkan_standard_kukulkan
            "Medusa"-> R.drawable.medusa_standard_medusa
            "Merlin"-> R.drawable.merlin_standard_merlin
            "Neith"-> R.drawable.neith_standard_neith
            "Nox"-> R.drawable.nox_standard_nox
            "Nu Wa"-> R.drawable.nu_wa_standard_nu_wa
            "Olorun"-> R.drawable.olorun_standard_olorun
            "Persephone"-> R.drawable.persephone_standard_persephone
            "Poseidon"-> R.drawable.poseidon_standard_poseidon
            "Ra"-> R.drawable.ra_standard_ra
            "Raijin"-> R.drawable.raijin_standard_raijin
            "Rama"-> R.drawable.rama_standard_rama
            "Scylla"-> R.drawable.scylla_standard_scylla
            "Skadi"-> R.drawable.skadi_standard_skadi
            "Sol"-> R.drawable.sol_standard_sol
            "Sylvanus"-> R.drawable.sylvanus_standard_sylvanus
            "The Morrigan"-> R.drawable.the_morrigan_standard_the_morrigan
            "Thoth"-> R.drawable.thoth_standard_thoth
            "Ullr"-> R.drawable.ullr_standard_ullr
            "Vulcan"-> R.drawable.vulcan_standard_vulcan
            "Xbalanque"-> R.drawable.xbalanque_standard_xbalanque
            "Yemoja"-> R.drawable.yemoja_standard_yemoja
            "Zeus"-> R.drawable.zeus_standard_zeus
            "Zhong Kui"-> R.drawable.zhong_kui_standard_zhong_kui
            "Tsukuyomi"-> R.drawable.tsukuyomi_standard_tsukuyomi
            "Mulan"-> R.drawable.mulan_standard_mulan
            "Cthulhu"-> R.drawable.cthulhu_standard_cthulhu
            "Tiamat"-> R.drawable.tiamat_standard_tiamat
            else -> R.drawable.ic_launcher_background
        }
        godImage.setImageResource(god_drawable)


    }

    private fun changeWheel(){
        val intent = Intent(this@MainActivity, Roulette_of_the_hunt::class.java)
        startActivity(intent)
    }


    val godList = listOf(
        "Achilles",
        "Amaterasu",
        "Ao Kuang",
        "Arachne",
        "Ares",
        "Artio",
        "Athena",
        "Awilix",
        "Bacchus",
        "Bakasura",
        "Bastet",
        "Bellona",
        "Cabrakan",
        "Camazotz",
        "Cerberus",
        "Chaac",
        "Cu Chulainn",
        "Da Ji",
        "Erlang Shen",
        "Fafnir",
        "Fenrir",
        "Freya",
        "Ganesha",
        "Geb",
        "Guan Yu",
        "Hercules",
        "Horus",
        "Hun Batz",
        "Kali",
        "Khepri",
        "King Arthur",
        "Kumbhakarna",
        "Kuzenbo",
        "Loki",
        "Mercury",
        "Mulan",
        "Ne Zha",
        "Nemesis",
        "Nike",
        "Odin",
        "Osiris",
        "Pele",
        "Ratatoskr",
        "Ravana",
        "Serqet",
        "Set",
        "Sobek",
        "Sun Wukong",
        "Susano",
        "Terra",
        "Thanatos",
        "Thor",
        "Tyr",
        "Vamana",
        "Xing Tian",
        "Ymir",
        "Agni",
        "Ah Muzen Cab",
        "Ah Puch",
        "Anhur",
        "Anubis",
        "Aphrodite",
        "Apollo",
        "Artemis",
        "Baba Yaga",
        "Baron Samedi",
        "Cernunnos",
        "Chang e",
        "Chernobog",
        "Chiron",
        "Chronos",
        "Cupid",
        "Discordia",
        "Hachiman",
        "Hades",
        "He Bo",
        "Heimdallr",
        "Hel",
        "Hera",
        "Hou Yi",
        "Isis",
        "Izanami",
        "Janus",
        "Jing Wei",
        "Jormungandr",
        "Kukulkan",
        "Medusa",
        "Merlin",
        "Neith",
        "Nox",
        "Nu Wa",
        "Olorun",
        "Persephone",
        "Poseidon",
        "Ra",
        "Raijin",
        "Rama",
        "Scylla",
        "Skadi",
        "Sol",
        "Sylvanus",
        "The Morrigan",
        "Thoth",
        "Ullr",
        "Vulcan",
        "Xbalanque",
        "Yemoja",
        "Zeus",
        "Zhong Kui",
        "Tsukuyomi",
        "Mulan",
        "Cthulhu",
        "Tiamat"
    )


}