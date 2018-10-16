package com.plucial.global;

/** 機械翻訳言語 */
public enum Lang implements LangEnum {
    en("en", "英語", Country.US, "English"),
    ja("ja", "日本語", Country.JP, "日本語"),
    ar("ar", "アラビア語", Country.PS, "العربية"),
    az("az", "アゼルバイジェン語", Country.AZ, "Azərbaycan"),
    bn("bn", "ベンガル語", Country.BD, "বাঙালি"),
    be("be", "ベラルーシ語", Country.BY, "беларускі"),
    bg("bg", "ブルガリア語", Country.BG, "български"),
    zh_ch("zh-CN","中国語 (簡体)", Country.CN, "中文（中国）"),
    zh_tw("zh-TW", "中国語 (繁体)", Country.TW, "中國（台灣）"),
    hr("hr", "クロアチア語", Country.HR, "hrvatska"),
    cs("cs", "チェコ語", Country.CZ, "čeština"),
    da("da", "デンマーク語", Country.DK, "danske"),
    nl("nl", "オランダ語", Country.NL, "nederlandse"),
    tl("tl", "タガログ語", Country.PH, "tagalog"),
    fi("fi", "フィンランド語", Country.FI, "suomi"),
    fr("fr", "フランス語", Country.FR, "français"),
    ka("ka", "ジョージア語", Country.GE, "ქართული"),
    de("de", "ドイツ語", Country.DE, "Deutsch"),
    el("el", "ギリシャ語", Country.GR, "Ελληνική"),
    hi("hi", "ヒンディー語", Country.IN, "हिन्दी"),
    hu("hu", "ハンガリー語", Country.HU, "magyar"),
    is("is", "アイスランド語", Country.IS, "Íslenska"),
    id("id", "インドネシア語", Country.ID, "indonesia"),
    ga("ga", "アイルランド語", Country.IE, "irish"),
    it("it", "イタリア語", Country.IT, "italiano"),
    ko("ko", "韓国語", Country.KR, "한국어"),
    la("la", "ラテン語", Country.VA, "Latine"),
    lv("lv", "ラトビア語 (レット語)", Country.LV, "Latvijā"),
    mk("mk", "マカドニア語", Country.MK, "ПЈР македонски"),
    ms("ms", "マレー語", Country.MY, "Melayu"),
    mt("mt", "マルタ語", Country.MT, "Malti"),
    no("no", "ノルウェー語", Country.NO, "norsk"),
    fa("fa", "ペルシャ語", Country.IR, "فارسی"),
    pl("pl", "ポーランド語", Country.PL, "Polskie"),
    pt("pt", "ポルトガル語", Country.PT, "português"),
    ro("ro", "ルーマニア語", Country.RO, "Română"),
    ru("ru", "ロシア語", Country.RU, "Русский"),
    sk("sk", "スロバキア語", Country.SK, "slovenský"),
    sl("sl", "スロヴェニア語", Country.SI, "slovenščina"),
    es("es", "スペイン語", Country.ES, "Español"),
    sv("sv", "スウェーデン語", Country.SE, "svenska"),
    th("th", "タイ語", Country.TH, "ภาษาไทย"),
    tr("tr", "トルコ語", Country.TR, "Türk"),
    uk("uk", "ウクライナ語", Country.UA, "Український"),
    lt("lt", "リトアニア語", Country.LT, "Lietuvos"),
    vi("vi", "ベトナム語",Country.VN, "Tiếng Việt"),
    sr("sr", "セルビア語", Country.RS, "Srpski"),

    yi("yi", "イディッシュ語", Country.DE, "ייִדיש"),
    ht("ht", "ハイチ語", Country.HT, "kreyòl ayisyen"),
    gl("gl", "ガリシア語", Country.ES, "galego"),
    et("et", "エストニア語", Country.EE, "eesti"),
    iw("iw", "ヘブライ語", Country.IL, "עברית"),
    ur("ur", "ウルドゥー語", Country.IN, "اردو"),
    te("te", "テルグ語",Country.IN, "Teluga"),
    ta("ta", "タミル語",Country.IN, "தமிழ்"),
    kn("kn", "カンナダ語",Country.IN, "ಕನ್ನಡ"),
    gu("gu", "グジャラート語",Country.IN, "ગુજરાતી"),
    sq("sq", "アルバニア語",Country.AL, "shqiptar"),
    af("af", "アフリカーンス語", Country.NL, "Afrikaans"),
    cy("cy", "ウェールズ語", Country.GB, "Cymraeg"),
    sw("sw", "スワヒリ語" , Country.CF, "Kiswahili"),
    eo("eo", "エスペラント語", Country.DE, "esperanto"),
    ca("ca", "カタロニア語", Country.ES, "català"),
    eu("eu", "バスク語", Country.ES, "Euskal"),



    hy("hr", "アルメニア語", Country.AM, "հայերեն"), // hy Armenian
    bs("bs", "ボスニア語", Country.BA, "bosanski"), // bs Bosnian
    ceb("ceb", "セブアノ語", Country.PH, "Sinugboanon"), // ceb Cebuano
    ny("ny", "チェワ語", Country.MW, "Chichewa"), // ny Chichewa
    ha("ha", "ハウサ語", Country.NG, "Hausa"), // ha Hausa
    hmn("hmn", "ミャオ語", null, "Hmong"), // hmn Hmong
    ig("ig", "イボ語", null, "Igbo"), // ig Igbo
    jw("jw", "ジャワ語", null, "Jawa"), // jw Javanese
    kk("kk", "カザフ語", null, "Қазақ"), // kk Kazakh
    km("km", "クメール語", null, "ភាសាខ្មែរ"), // km Khmer
    lo("lo", "ラオ語", null, "ລາວ"), // lo Lao
    mg("mg", "マダガスカル語", null, "Malagasy"), // mg Malagasy
    mr("mr", "マラーティー語", null, "मराठी"), // mr Marathi
    mn("mn", "モンゴル語", null, "Монгол"), // mn Mongolian
    my("my", "ビルマ語", null, "မြန်မာ"), // my Myanmar (Burmese)
    ne("ne", "ネパール語", null, "नेपाली"), // ne Nepali
    pa("pa", "パンジャブ語", null, "ਪੰਜਾਬੀ ਦੇ"), // ma Punjabi
    st("st", "ソト語", null, "Sesotho"), // st Sesotho
    si("si", "シンハラ語", null, "සිංහල"), // si Sinhala
    so("so", "ソマリ語", null, "Soomaali"), // so Somali
    su("su", "スンダ語", null, "Sunda"), // su Sudanese
    tg("tg", "ペルシア語", null, "فارسی"), // tg Tajik
    uz("uz", "ウズベク語", null, "O'zbekiston"), // uz Uzbek
    yo("yo", "ヨルバ語", null, "yorùbá"), // yo Yoruba
    zu("zu", "ズールー語", null, "Zulu"), // zu Zulu
    ml("ml", "マラヤーラム語", null, "മലയാളം"), // Malayalam
    mi("mi", "マオリ語", null, "Maori"); // Maori

    private String langKey;
    private Country country;
    private String name;

    private Lang(String langKey,String nameJp, Country country, String name) {
        this.langKey = langKey;
        this.country = country;
        this.name = name;
    }

    /**
     * Propertis ファイルキーを取得
     * @return
     */
    public String getPropertieKey() {
        return "lang." + this.toString();
    }

    public String getLangKey() {
        return langKey;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

	@Override
	public Lang getLang() {
		return this;
	}
}
