package com.heroku.seiyulab;

public enum MediaCode {
    anime_2015("2015年のテレビアニメ", "テレビアニメ(2015)", "2000s"),
    anime_2016("2016年のテレビアニメ", "テレビアニメ(2016)", "1000s"),
    anime_2017("2017年のテレビアニメ", "テレビアニメ(2017)", "3000s"),
    game_2015("2015年のコンピュータゲーム", "ゲーム(2015)", "2030s"),
    game_2016("2016年のコンピュータゲーム", "ゲーム(2016)", "1030s"),
    game_2017("2017年のコンピュータゲーム", "ゲーム(2017)", "3030s"),
    ova_2015("2015年のOVA", "OVA(2015)", "2060s"),
    ova_2016("2016年のOVA", "OVA(2016)", "1060s"),
    ova_2017("2017年のOVA", "OVA(2017)", "3060s"),
    amovie_2015("2015年のアニメ映画", "アニメ映画(2015)", "2090s"),
    amovie_2016("2016年のアニメ映画", "アニメ映画(2016)", "1090s"),
    amovie_2017("2017年のアニメ映画", "アニメ映画(2017)", "3090s"),
    movie_2015("2015年の映画", "映画(2015)", "2120s"),
    movie_2016("2016年の映画", "映画(2016)", "1120s"),
    movie_2017("2017年の映画", "映画(2017)", "3120s"),
    drama_2015("2015年のテレビドラマ", "テレビドラマ(2015)", "2150s"),
    drama_2016("2016年のテレビドラマ", "テレビドラマ(2016)", "1150s"),
    drama_2017("2017年のテレビドラマ", "テレビドラマ(2017)", "3150s"),
    tv_2015("2015年のテレビ番組_(日本)", "テレビ番組(2015)", "2180s"),
    tv_2016("2016年のテレビ番組_(日本)", "テレビ番組(2016)", "1180s"),
    tv_2017("2017年のテレビ番組_(日本)", "テレビ番組(2017)", "3180s"),
    production("声優プロダクション", "声優プロダクション", "1240s"),
    continuation("継続中の作品", "継続中作品", "2970s"),
    aradio("アニラジ", "アニラジ", "2210s"),
    aginfo("アニメ・ゲーム情報番組", "アニメ・ゲーム情報番組", "2240s"),
    seiyuvar("声優バラエティ番組", "声優バラエティ番組", "2270s"),
    asong("アニメソング番組", "アニメソング番組", "2300s"),
    radio_2015("2015年のラジオ番組_(日本)", "ラジオ番組(2015)", "2360s"),
    radio_2016("2016年のラジオ番組_(日本)", "ラジオ番組(2016)", "1210s"),
    radio_2017("2017年のラジオ番組_(日本)", "ラジオ番組(2017)", "3210s"),
    ar_hibiki("HiBiKi_Radio_Station","HiBiKi","1270s"),
    ar_onsen("音泉","音泉","1300s"),
    ar_aandg("超!A&G+","超!A&G+","1330s"),
    ar_animatetv("アニメイトTV","アニメイトTV","1360s");
    

    private MediaCode(String categoryName, String twitterExpression, String period) {
        this.categoryName = categoryName;
        this.twitterExpression = twitterExpression;
        this.period = period;
    }
    public String categoryName;
    public String twitterExpression;
    public String period;
}
