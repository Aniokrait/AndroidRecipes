package com.example.androidrecipes.compose.heritages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.androidrecipes.data.Heritage

val heritages = listOf(

    Heritage(1, "日本銀行本店本館", "辰野金吾の代表作で、現存する明治洋風建築のうち、最も重要なものの一つ。三階建地下一階で、外壁は石積みの内側にレンガを積む。内外ともネオ・バロック様式にルネッサンス的意匠を加味している。関東大震災で被災し、一部改造されているが、外観と一階の大部分および二階の主要部などはよく当初の形態を残している。", "https://bunka.nii.ac.jp/heritage/43967/_109430/43967_109430111225041739434_300.jpg"),
    Heritage(2, "大阪市中央公会堂", "大阪市中央公会堂は，中之島地区の東端部にある。北浜で株式仲買商を営んでいた岩本栄之助の寄付によって，大正７年10月に竣工した。\n" +
            "　設計は，指名設計競技に一等当選した岡田信一郎の設計案をもとに，実施設計は辰野金吾，片岡安が中心となって進めた。\n" +
            "　構造は鉄骨煉瓦造，三階建，地下一階である。一，二階の吹き抜けの大集会室，三階の中集会室，特別室，小集会室などを中心に各室が配されている。\n" +
            "　大阪市中央公会堂は，ネオ・ルネッサンスを基調にバロック的な躍動感を加味した意匠で，我が国における様式建築の習熟の過程をよく示している。\n" +
            "　我が国の煉瓦を主体とした建築の到達点をかざる建築のひとつといえ，高い価値がある。", "https://bunka.nii.ac.jp/heritage/43967/_112683/43967_112683111225041511024_300.jpg"),
    Heritage(3, "東京駅丸ノ内本屋 ", "東京駅丸ノ内本屋は，皇居から東へ一直線に延びる通称行幸通りの正面に位置している。明治41年３月25日着工，大正３年12月14日に竣工した。設計は辰野金吾で，辰野葛西事務所によって実施案がまとめられた。\n" +
            "　南北折曲り延長約３３５ｍに及ぶ長大な建築で，中央棟の南北に両翼を長く延ばし，建設当初は，地上３階建であった。建築様式は，いわゆる辰野式フリー・クラシックの様式になる。\n" +
            "　東京駅丸ノ内本屋は，わが国鉄道網の起点となる停車場の中心施設であるとともに，明治の市区改正計画に基づき建設された首都東京を象徴する貴重な建築である。\n" +
            "　煉瓦を主体とする建造物のうち最大規模の建築で，当時，日本建築界を主導した辰野金吾の集大成となる作品として，価値が高い。", "https://bunka.nii.ac.jp/heritage/43967/_112706/43967_112706120106192754349_300.jpg"),
    Heritage(4, "武雄温泉新館及び楼門 楼門", "武雄温泉新館及び楼門は，近代に入り，観光温泉町として発展した武雄の拠点として計画された。ともに辰野・葛西事務所の設計，清水満之助の施工で，新館は大正３年８月６日，楼門は同年11月20日に上棟，大正４年４月12日に落成式が挙行された。\n" +
            "　新館は，正面中央に玄関車寄を備えた木造二階建の主体部を中心に，両翼を張り出し，背面に浴室，便所を別棟で附属する。\n" +
            "　楼門は，入母屋造本瓦葺の木造二重門で，竜宮門形式である。\n" +
            "　武雄温泉新館及び楼門は，伝統的な和風意匠を基調としつつ，細部意匠や架構等に新しい試みがみられ，高い価値がある。当時の建築界をリードしていた建築家の辰野金吾が関与した数少ない和風建築としても貴重である。\n" +
            "　全体の配置計画などにも特徴があり，わが国の近代保養施設の歴史を知る上でも重要である。\n" +
            "\n", "https://bunka.nii.ac.jp/heritage/43967/_112849/43967_112849111227175243332_300.jpg"),
    Heritage(5, "武雄温泉新館及び楼門 新館", "武雄温泉新館及び楼門は，近代に入り，観光温泉町として発展した武雄の拠点として計画された。ともに辰野・葛西事務所の設計，清水満之助の施工で，新館は大正３年８月６日，楼門は同年11月20日に上棟，大正４年４月12日に落成式が挙行された。\n" +
            "　新館は，正面中央に玄関車寄を備えた木造二階建の主体部を中心に，両翼を張り出し，背面に浴室，便所を別棟で附属する。\n" +
            "　楼門は，入母屋造本瓦葺の木造二重門で，竜宮門形式である。\n" +
            "　武雄温泉新館及び楼門は，伝統的な和風意匠を基調としつつ，細部意匠や架構等に新しい試みがみられ，高い価値がある。当時の建築界をリードしていた建築家の辰野金吾が関与した数少ない和風建築としても貴重である。\n" +
            "　全体の配置計画などにも特徴があり，わが国の近代保養施設の歴史を知る上でも重要である。", "https://bunka.nii.ac.jp/heritage/43967/_112848/43967_112848111227175240591_300.jpg"),
    Heritage(6, "旧函館区公会堂 本館", "函館区（現函館市）の公会堂として明治４２年５月に着工、明治４３年９月に竣工したもので、本館と附属棟から構成される。設計者は函館区技師小西朝次郎、棟梁は村木甚三郎である。本館は木造２階建、桟瓦葺寄棟屋根で、１階は中廊下に面して食堂、球戯室、寝室、会議室などの小部屋が配され、２階は大部分を講堂とし、正面にバルコニーを設けている。附属棟は管理人の住居として建設された木造平屋建、桟瓦葺寄棟屋根で、本館と渡廊下で繋がれる。明治時代に建てられた公会堂建築の数少ない遺構であり、我が国を代表する明治洋風建築の１つである。", "https://bunka.nii.ac.jp/heritage/43967/_108939/43967_108939111225040630229_300.jpg"),
)

@Composable
fun HeritageListScreen(
    navigateToHeritageDetail: (Int) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        items(heritages) { heritage ->
            HeritageListItem(heritage, navigateToHeritageDetail)
            Divider(modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun HeritageListItem(heritage: Heritage, navigateToHeritageDetail: (Int) -> Unit) {
    Row(
        modifier = Modifier.clickable {
            navigateToHeritageDetail(heritage.id)
        }
    ) {
        AsyncImage(
            model = heritage.imageUrl,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )


        Text(heritage.name)
    }
}

@Composable
@Preview
fun HeritageListItemPreview() {
    HeritageListItem(heritages[0]) {}
}