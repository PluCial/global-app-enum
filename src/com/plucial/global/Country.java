package com.plucial.global;

/**
 * 国
 * <pre>
 * 参照：
 * https://ja.wikipedia.org/wiki/ISO_3166-1
 * </pre>
 * @author takahara
 *
 */
public enum Country {
    JP("JPN",392,"日本","81", Currencie.JPY),
    IS("ISL",352,"アイスランド","354", Currencie.ISK),
    IE("IRL",372,"アイルランド","353", Currencie.EUR),
    AZ("AZE",31,"アゼルバイジャン","994", Currencie.AZN),
    AF("AFG",4,"アフガニスタン","93", Currencie.AFN),
    US("USA",840,"アメリカ合衆国","1", Currencie.USD),
    VI("VIR",850,"アメリカ領ヴァージン諸島","1-340", Currencie.USD),
    AS("ASM",16,"アメリカ領サモア","1-684", Currencie.WST),
    AE("ARE",784,"アラブ首長国連邦","971", Currencie.AED),
    DZ("DZA",12,"アルジェリア","213", Currencie.DZD),
    AR("ARG",32,"アルゼンチン","54", Currencie.ARS),
    AW("ABW",533,"アルバ","297", Currencie.AWG),
    AL("ALB",8,"アルバニア","355", Currencie.ALL),
    AI("AIA",660,"アンギラ","264", Currencie.XCD),
    AO("AGO",24,"アンゴラ","244", Currencie.AOA),
    AG("ATG",28,"アンティグア・バーブーダ","1-268", Currencie.XCD),
    AD("AND",20,"アンドラ","376", Currencie.EUR),
    YE("YEM",887,"イエメン","967", Currencie.YER),
    GB("GBR",826,"イギリス","44", Currencie.GBP),
    VG("VGB",92,"イギリス領ヴァージン諸島","1-284", Currencie.USD),
    IL("ISR",376,"イスラエル","972", Currencie.ILS),
    IT("ITA",380,"イタリア","39", Currencie.EUR),
    IQ("IRQ",368,"イラク","964", Currencie.IQD),
    IR("IRN",364,"イラン・イスラム共和国","98", Currencie.IRR),
    IN("IND",356,"インド","91", Currencie.INR),
    ID("IDN",360,"インドネシア","62", Currencie.IDR),
    WF("WLF",876,"ウォリス・フツナ","681", Currencie.XPF),
    UG("UGA",800,"ウガンダ","256", Currencie.UGX),
    UA("UKR",804,"ウクライナ","380", Currencie.UAH),
    UZ("UZB",860,"ウズベキスタン","998", Currencie.UZS),
    UY("URY",858,"ウルグアイ","598", Currencie.UYU),
    EC("ECU",218,"エクアドル","593", Currencie.USD),
    EG("EGY",818,"エジプト","20", Currencie.EGP),
    EE("EST",233,"エストニア","372", Currencie.EUR),
    ET("ETH",231,"エチオピア","251", Currencie.ETB),
    ER("ERI",232,"エリトリア","291", Currencie.ERN),
    SV("SLV",222,"エルサルバドル","503", Currencie.SVC),
    AU("AUS",36,"オーストラリア","61", Currencie.AUD),
    AT("AUT",40,"オーストリア","43", Currencie.EUR),
    OM("OMN",512,"オマーン","968", Currencie.OMR),
    NL("NLD",528,"オランダ","31", Currencie.EUR),
    GH("GHA",288,"ガーナ","233", Currencie.GHC),
    CV("CPV",132,"カーボベルデ","238", Currencie.CVE),
    GY("GUY",328,"ガイアナ","592", Currencie.GYD),
    QA("QAT",634,"カタール","974", Currencie.QAR),
    CA("CAN",124,"カナダ","1", Currencie.CAD),
    GA("GAB",266,"ガボン","241", Currencie.XAF),
    CM("CMR",120,"カメルーン","237", Currencie.XAF),
    GM("GMB",270,"ガンビア","220", Currencie.GMD),
    KH("KHM",116,"カンボジア","855", Currencie.KHR),
    GN("GIN",324,"ギニア","224", Currencie.GNF),
    GW("GNB",624,"ギニアビサウ","245", Currencie.XOF),
    CY("CYP",196,"キプロス","357", Currencie.EUR),
    CU("CUB",192,"キューバ","53", Currencie.CUC),
    CW("CUW",531,"キュラソー","599", Currencie.ANG),
    GR("GRC",300,"ギリシャ","30", Currencie.EUR),
    KI("KIR",296,"キリバス","686", Currencie.AUD),
    KG("KGZ",417,"キルギス","996", Currencie.KGS),
    GT("GTM",320,"グアテマラ","502", Currencie.GTQ),
    KW("KWT",414,"クウェート","965", Currencie.KWD),
    CK("COK",184,"クック諸島","682", Currencie.NZD),
    GL("GRL",304,"グリーンランド","299", Currencie.DKK),
    CX("CXR",162,"クリスマス島","61", Currencie.AUD),
    GE("GEO",268,"グルジア","995", Currencie.GEL),
    GD("GRD",308,"グレナダ","1-473", Currencie.XCD),
    HR("HRV",191,"クロアチア","385", Currencie.HRK),
    KY("CYM",136,"ケイマン諸島","1-345", Currencie.KYD),
    KE("KEN",404,"ケニア","254", Currencie.KES),
    CI("CIV",384,"コートジボワール","225", Currencie.XOF),
    CC("CCK",166,"ココス諸島","61", Currencie.AUD),
    CR("CRI",188,"コスタリカ","506", Currencie.CRC),
    KM("COM",174,"コモロ","269", Currencie.KMF),
    CO("COL",170,"コロンビア","57", Currencie.COP),
    CG("COG",178,"コンゴ共和国","242", Currencie.XAF),
    CD("COD",180,"コンゴ民主共和国","243", Currencie.CDF),
    SA("SAU",682,"サウジアラビア","966", Currencie.SAR),
    GS("SGS",239,"サウスジョージア・サウスサンドウィッチ諸島","500", Currencie.GBP),
    WS("WSM",882,"サモア","685", Currencie.WST),
    ST("STP",678,"サントメ・プリンシペ","239", Currencie.STD),
    BL("BLM",652,"サン・バルテルミー","590", Currencie.EUR),
    ZM("ZMB",894,"ザンビア","260", Currencie.ZMK),
    SM("SMR",674,"サンマリノ","378", Currencie.EUR),
    MF("MAF",663,"サン・マルタン","590", Currencie.EUR),
    SL("SLE",694,"シエラレオネ","232", Currencie.SLL),
    DJ("DJI",262,"ジブチ","253", Currencie.DJF),
    GI("GIB",292,"ジブラルタル","350", Currencie.GIP),
    JM("JAM",388,"ジャマイカ","1-876", Currencie.JMD),
    SG("SGP",702,"シンガポール","65", Currencie.SGD),
    ZW("ZWE",716,"ジンバブエ","263", Currencie.ZWD),
    CH("CHE",756,"スイス","41", Currencie.CHF),
    SE("SWE",752,"スウェーデン","46", Currencie.SEK),
    SD("SDN",729,"スーダン","249", Currencie.SDG),
    ES("ESP",724,"スペイン","34", Currencie.EUR),
    SR("SUR",740,"スリナム","597", Currencie.SRD),
    LK("LKA",144,"スリランカ","94", Currencie.LKR),
    SK("SVK",703,"スロバキア","421", Currencie.EUR),
    SI("SVN",705,"スロベニア","386", Currencie.EUR),
    SZ("SWZ",748,"スワジランド","268", Currencie.SZL),
    SC("SYC",690,"セーシェル","248", Currencie.SCR),
    GQ("GNQ",226,"赤道ギニア","240", Currencie.XAF),
    SN("SEN",686,"セネガル","221", Currencie.XOF),
    RS("SRB",688,"セルビア","381", Currencie.CSD),
    KN("KNA",659,"セントクリストファー・ネイビス","1-869", Currencie.XCD),
    VC("VCT",670,"セントビンセントおよびグレナディーン諸島","1-784", Currencie.XCD),
    SH("SHN",654,"トリスタンダクーニャ","290", Currencie.SHP),
    LC("LCA",662,"セントルシア","1-758", Currencie.XCD),
    SB("SLB",90,"ソロモン諸島","677", Currencie.SBD),
    TC("TCA",796,"タークス・カイコス諸島","1-649", Currencie.USD),
    TH("THA",764,"タイ","66", Currencie.THB),
    KR("KOR",410,"韓国","82", Currencie.KRW),
    TW("TWN",158,"台湾","886", Currencie.TWD),
    TJ("TJK",762,"タジキスタン","992", Currencie.TJS),
    TZ("TZA",834,"タンザニア","255", Currencie.TZS),
    CZ("CZE",203,"チェコ","420", Currencie.CZK),
    TD("TCD",148,"チャド","235", Currencie.XAF),
    CF("CAF",140,"中央アフリカ共和国","236", Currencie.XAF),
    CN("CHN",156,"中国","86", Currencie.CNY),
    TN("TUN",788,"チュニジア","216", Currencie.TND),
    KP("PRK",408,"朝鮮民主主義人民共和国","850", Currencie.KPW),
    CL("CHL",152,"チリ","56", Currencie.CLP),
    DK("DNK",208,"デンマーク","45", Currencie.DKK),
    DE("DEU",276,"ドイツ","49", Currencie.EUR),
    TG("TGO",768,"トーゴ","228", Currencie.XOF),
    TK("TKL",772,"トケラウ","690", Currencie.NZD),
    DO("DOM",214,"ドミニカ共和国","1-809", Currencie.DOP),
    DM("DMA",212,"ドミニカ国","1-767", Currencie.XCD),
    TT("TTO",780,"トリニダード・トバゴ","1-868", Currencie.TTD),
    TM("TKM",795,"トルクメニスタン","993", Currencie.TMM),
    TR("TUR",792,"トルコ","90", Currencie.YTL),
    TO("TON",776,"トンガ","676", Currencie.TOP),
    NG("NGA",566,"ナイジェリア","234", Currencie.NGN),
    NR("NRU",520,"ナウル","674", Currencie.AUD),
    NA("NAM",516,"ナミビア","264", Currencie.NAD),
    NU("NIU",570,"ニウエ","683", Currencie.NZD),
    NI("NIC",558,"ニカラグア","505", Currencie.NIO),
    NE("NER",562,"ニジェール","227", Currencie.XOF),
    EH("ESH",732,"西サハラ","282", Currencie.MAD),
    NC("NCL",540,"ニューカレドニア","687", Currencie.XPF),
    NZ("NZL",554,"ニュージーランド","64", Currencie.NZD),
    NP("NPL",524,"ネパール","977", Currencie.NPR),
    NF("NFK",574,"ノーフォーク島","672", Currencie.AUD),
    NO("NOR",578,"ノルウェー","47", Currencie.NOK),
    BH("BHR",48,"バーレーン","973", Currencie.BHD),
    HT("HTI",332,"ハイチ","509", Currencie.HTG),
    PK("PAK",586,"パキスタン","92", Currencie.PKR),
    VA("VAT",336,"バチカン市国","379", Currencie.EUR),
    PA("PAN",591,"パナマ","507", Currencie.PAB),
    VU("VUT",548,"バヌアツ","678", Currencie.VUV),
    BS("BHS",44,"バハマ","1-242", Currencie.BSD),
    PG("PNG",598,"パプアニューギニア","675", Currencie.PGK),
    BM("BMU",60,"バミューダ","1-441", Currencie.BMD),
    PW("PLW",585,"パラオ","680", Currencie.USD),
    PY("PRY",600,"パラグアイ","595", Currencie.PYG),
    BB("BRB",52,"バルバドス","1-246", Currencie.BBD),
    PS("PSE",275,"パレスチナ","970", Currencie.ILS),
    HU("HUN",348,"ハンガリー","36", Currencie.HUF),
    BD("BGD",50,"バングラデシュ","880", Currencie.BDT),
    TL("TLS",626,"東ティモール","1-670", Currencie.USD),
    FJ("FJI",242,"フィジー","679", Currencie.FJD),
    PH("PHL",608,"フィリピン","63", Currencie.PHP),
    FI("FIN",246,"フィンランド","358", Currencie.EUR),
    BT("BTN",64,"ブータン","975", Currencie.BTN),
    FK("FLK",238,"フォークランド諸島","500", Currencie.FKP),
    BR("BRA",76,"ブラジル","55", Currencie.BRL),
    FR("FRA",250,"フランス","33", Currencie.EUR),
    PF("PYF",258,"フランス領ポリネシア","689", Currencie.XPF),
    BG("BGR",100,"ブルガリア","359", Currencie.BGN),
    BF("BFA",854,"ブルキナファソ","226", Currencie.XOF),
    BN("BRN",96,"ブルネイ","673", Currencie.BND),
    BI("BDI",108,"ブルンジ","257", Currencie.BIF),
    VN("VNM",704,"ベトナム","84", Currencie.VND),
    BJ("BEN",204,"ベナン","229", Currencie.XOF),
    VE("VEN",862,"ベネズエラ・ボリバル共和国","58", Currencie.VEB),
    BY("BLR",112,"ベラルーシ","375", Currencie.BYR),
    BZ("BLZ",84,"ベリーズ","501", Currencie.BZD),
    PE("PER",604,"ペルー","51", Currencie.PEN),
    BE("BEL",56,"ベルギー","32", Currencie.EUR),
    PL("POL",616,"ポーランド","48", Currencie.PLN),
    BA("BIH",70,"ボスニア・ヘルツェゴビナ","387", Currencie.BAM),
    BW("BWA",72,"ボツワナ","267", Currencie.BWP),
    BO("BOL",68,"ボリビア","591", Currencie.BOB),
    PT("PRT",620,"ポルトガル","351", Currencie.EUR),
    HK("HKG",344,"香港","852", Currencie.HKD),
    HN("HND",340,"ホンジュラス","504", Currencie.HNL),
    MH("MHL",584,"マーシャル諸島","692", Currencie.USD),
    MO("MAC",446,"マカオ","853", Currencie.MOP),
    MK("MKD",807,"マケドニア","389", Currencie.MKD),
    YT("MYT",175,"マヨット","262", Currencie.EUR),
    MW("MWI",454,"マラウイ","265", Currencie.MWK),
    ML("MLI",466,"マリ","223", Currencie.XOF),
    MT("MLT",470,"マルタ","356", Currencie.EUR),
    MQ("MTQ",474,"マルティニーク","596", Currencie.EUR),
    MY("MYS",458,"マレーシア","60", Currencie.MYR),
    FM("FSM",583,"ミクロネシア連邦","691", Currencie.USD),
    ZA("ZAF",710,"南アフリカ","27", Currencie.ZAR),
    SS("SSD",728,"南スーダン","211", Currencie.SSP),
    MM("MMR",104,"ミャンマー","95", Currencie.MMK),
    MX("MEX",484,"メキシコ","52", Currencie.MXN),
    MU("MUS",480,"モーリシャス","230", Currencie.MUR),
    MR("MRT",478,"モーリタニア","222", Currencie.MRO),
    MZ("MOZ",508,"モザンビーク","258", Currencie.MZN),
    MC("MCO",492,"モナコ","377", Currencie.EUR),
    MV("MDV",462,"モルディブ","960", Currencie.MVR),
    MD("MDA",498,"モルドバ共和国","373", Currencie.MDL),
    MA("MAR",504,"モロッコ","212", Currencie.MAD),
    MN("MNG",496,"モンゴル","976", Currencie.MNT),
    ME("MNE",499,"モンテネグロ","382", Currencie.EUR),
    MS("MSR",500,"モントセラト","1-664", Currencie.XCD),
    JO("JOR",400,"ヨルダン","962", Currencie.JOD),
    LA("LAO",418,"ラオス","856", Currencie.LAK),
    LV("LVA",428,"ラトビア","371", Currencie.EUR),
    LT("LTU",440,"リトアニア","370", Currencie.LTL),
    LY("LBY",434,"リビア","218", Currencie.LYD),
    LI("LIE",438,"リヒテンシュタイン","423", Currencie.CHF),
    LR("LBR",430,"リベリア","231", Currencie.LRD),
    RO("ROU",642,"ルーマニア","40", Currencie.RON),
    LU("LUX",442,"ルクセンブルク","352", Currencie.EUR),
    RW("RWA",646,"ルワンダ","250", Currencie.RWF),
    LS("LSO",426,"レソト","266", Currencie.LSL),
    LB("LBN",422,"レバノン","961", Currencie.LBP),
    RU("RUS",643,"ロシア","7", Currencie.RUB),
    AM("ARM",51,"アルメニア","374", Currencie.AMD);
//  RE("REU",638,"レユニオン"),
//IO("IOT",86,"イギリス領インド洋地域"),
//AX("ALA",248,"オーランド諸島","358"),
//GG("GGY",831,"ガーンジー","44"),
//KZ("KAZ",398,"カザフスタン","7", Currencie.KZT),
//UM("UMI",581,"合衆国領有小離島"),
//MP("MNP",580,"北マリアナ諸島","1-670"),
//GP("GLP",312,"グアドループ"),
//GU("GUM",316,"グアム","1-671"),
//PM("SPM",666,"サンピエール島・ミクロン島"),
//JE("JEY",832,"ジャージー"),
//SY("SYR",760,"シリア・アラブ共和国","963"),
//SX("SXM",534,"シント・マールテン（オランダ領）"),
//SJ("SJM",744,"スヴァールバル諸島およびヤンマイエン島"),
//SO("SOM",706,"ソマリア","252", Currencie.SOS),
//TV("TUV",798,"ツバル","688"),
//AQ("ATA",10,"南極","672"),
//HM("HMD",334,"ハード島とマクドナルド諸島"),
//PN("PCN",612,"ピトケアン"),
//BV("BVT",74,"ブーベ島"),
//PR("PRI",630,"プエルトリコ","1-787"),
//FO("FRO",234,"フェロー諸島","298"),
//GF("GUF",254,"フランス領ギアナ"),
//TF("ATF",260,"フランス領南方・南極地域"),
//BQ("BES",535,"ボネール、シント・ユースタティウスおよびサバ"),
//MG("MDG",450,"マダガスカル","261"),
//IM("IMN",833,"マン島","44"),


    private String name;
    private String alpha3;
    private int numeric;
    private String interCallCode;
    private Currencie currencie;

    private Country(String alpha3, int numeric, String name, String interCallCode, Currencie currencie) {
        this.alpha3 = alpha3;
        this.numeric = numeric;
        this.name = name;
        this.interCallCode = interCallCode;
        this.currencie = currencie;
    }

    public String getName() {
        return name;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public int getNumeric() {
        return numeric;
    }

    public String getInterCallCode() {
        return interCallCode;
    }

    public void setInterCallCode(String interCallCode) {
        this.interCallCode = interCallCode;
    }

    public Currencie getCurrencie() {
        return currencie;
    }

    /**
     * Propertis ファイルキーを取得
     * @return
     */
    public String getPropertieKey() {
        return "country." + this.toString();
    }
}
