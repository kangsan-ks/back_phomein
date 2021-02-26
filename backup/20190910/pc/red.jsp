<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page buffer="none"%>
<%@ include file="/WEB-INF/jsp/include/declare.jspf"%>
<!doctype html>
<html lang="ko">
<head>
<title>포메인</title>
<%@ include file="/WEB-INF/jsp/company/include/head.jspf"%>
</head>

<link rel="stylesheet" href="../images/red/jquery.fullpage.css">

<style>
/* reset */
html { color: -internal-root-color;}
body { width: 100%; min-width: 1200px; color: #222; font-family: 'Noto Sans KR', 'Malgun Gothic', dotum, gulim, verdana, sans-serif; font-weight: 400; font-size: 14px; letter-spacing: -0.05em; word-break: break-all;}
html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, input, select, textarea, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video { margin: 0px; padding: 0px; vertical-align: top;}
h1, h2, h3, h4, h5, h6, th {font-weight: 400;}
.mt80 {margin-top: 80px !important;}

.clear:after{content:""; display: block; clear:both;}

/* content */
.inner02 { position: relative; width: 100%; height: 100%; }
.con-title { text-align: center; }
.con-title h3.h3-type { display: block; color: #222; font-size: 35px; font-weight: 500; letter-spacing: -1px;}
.con-title .n-txt { display: block; color: #999; font-size: 19px; line-height: 40px; letter-spacing: -0.5px; font-weight: 400;}
.con-title .n-txt b{color: #ac1600;}

/* red01 */
.red01-wrap{}
.red01-inner{position: relative; text-align: center; font-size: 0;}
.red01-inner::after{position: absolute; top: 103px; left: 50%; width: 1px; height: 120px; display: block; content:""; z-index: 1; background: #d4c7b1;}
.red01-inner > img{width: 199px; height: 83px; margin-bottom:190px; display: inline-block; vertical-align:top;}
.red01-inner p{font-size: 25px; line-height:40px; letter-spacing:0; font-weight: 500; color: #333;}
.red01-inner span{margin: 25px 0 108px; font-size: 19px; line-height:30px; letter-spacing:0; font-weight: 400; color: #666; display: block;}
/* red01 */

/* red02 */
.red02-wrap{width: 100%; max-width:1800px; margin: 0 auto 130px;}
.red02-bg{height: 586px; background: url(../images/red/red02-bg.jpg) center center no-repeat; background-size: cover;}
.red02-inner{text-align: center;}
.red02-tit{padding: 95px 0 90px;}
.red02-tit p{font-size: 50px; line-height:32px; letter-spacing:0; font-weight: bold; color: #333;}
.red02-in{width: 1040px; margin: 43px auto 0;}
.red02-in > div{width: 460px; height: 320px; margin-right: 120px; float: left; position: relative; background: #fff; text-align: center; font-size: 0; box-shadow:3px 3px 6px 3px rgba(0,0,0,0.1);}
.red02-in > div:last-of-type{margin-right: 0;}
.red02-in > div .img-pos{top: -43px; left: 50%; margin-left: -105px; width: 210px; height: 87px; display: block; position: absolute;}
.red02-in > div .r-tit{margin-top: 70px; font-size: 25px; line-height:32px; letter-spacing:0; font-weight: bold; color: #333;}
.red02-in > div .r-bar{width: 30px; height: 2px; margin: 20px auto 30px; display: block; background: #ddd;}
.red02-in > div .img-icon{margin-bottom: 20px; display: inline-block; vertical-align:top;}
.red02-in > div .r-name{font-size: 19px; line-height:32px; letter-spacing:0; font-weight: bold; color: #333;}
.red02-in > div .r-txt{font-size: 19px; line-height:32px; letter-spacing:0; font-weight: 400; color: #666; display: block;}

/* red02 */

/* red03 */
.red03-wrap{width: 100%; max-width:1800px; margin: 0 auto 120px;}
.red03-bg{height: 831px; background: url(../images/red/red03-bg.jpg) center center no-repeat; background-size: cover;}
.red03-inner{ text-align: center;}
.red03-tit{padding: 110px 0 50px;}
.red03-tit p{font-size: 38px; line-height: 1; letter-spacing:0; font-weight: bold; color: #fff;}
.red03-tit i{width: 30px; height: 2px; margin: 20px auto 15px; font-style: normal; display: block; background: #fff;}
.red03-tit span{font-size: 19px; line-height:32px; letter-spacing:0; font-weight: 400; color: #fff; display: block;}
.red03-in {width: 1200px; box-sizing:border-box; border: 1px solid #ccc; border-bottom: 3px solid #ccc; margin: 0 auto;}
.red03-in > div{padding-top: 50px; width: 33%; height: 538px; background: #fff; float: left; box-sizing:border-box; font-size: 0;}
.red03-in > div:nth-of-type(2){width: 34%; box-sizing:border-box; border-left: 1px solid #ccc; border-right: 1px solid #ccc;}
.red03-in > div img{margin-bottom: 15px; display: inline-block; vertical-align:top;}
.red03-in > div p{font-size: 30px; line-height:40px; letter-spacing:0; font-weight: 500; color: #333;}
.red03-in > div .bar{width: 30px; height: 2px; margin: 20px auto 15px; font-style: normal; display: block; background: #ccc;}
.red03-in > div span{padding-bottom: 10px; font-size: 17px; line-height:28px; letter-spacing:0; font-weight: 400; color: #666; display: block;}
.red03-in > div span b{color: #ac1600; font-weight: bold;}
.red03-in > div strong{padding: 0 60px; margin-top: 15px; font-size: 14px; line-height:24px; letter-spacing:0; font-weight: 400; color: #999; display: block; text-align: left; box-sizing:border-box;}
.red03-in > div strong i{width: 17px; display: inline-block; vertical-align:top;}
/* red03 */

/* red04 */
.red04-wrap{}
.red04-inner{width: 100%; max-width:1200px; margin: 0 auto 47px; overflow: hidden;}
.red04-inner .red04-left{width: 520px; height: 350px; float: left; background: url(../images/red/red04-bg01.jpg) center center no-repeat; background-size: 100% 100%;}
.red04-inner .red04-left p{padding: 80px 0 40px; font-size: 39px; line-height:54px; letter-spacing:0; font-weight: bold; color: #333;}
.red04-inner .red04-left span{font-size: 19px; line-height:30px; letter-spacing:0; font-weight: 400; color: #666; display: block;}
.red04-inner .red04-right{width: 680px; height: 350px; float: left;}
.red04-inner .red04-right img{width: 100%; height: 100%; display: block;}
/* red04 */

/* red05 */
.red05-wrap{}
.red05-inner{padding-top: 114px; width: 100%; max-width:1200px; margin: 0 auto 160px; box-sizing:border-box;}
.red05-inner table{width: 100%; box-sizing:border-box; border-top: 2px solid #8a382c; border-spacing: 0;}
.red05-inner table tr th{border-bottom: 1px solid #ccc;}
.red05-inner table tr td{border-bottom: 1px solid #ccc;}
.red05-inner table tr th.th-cen{padding: 50px 0; font-size: 40px; line-height:30px; letter-spacing:0; font-weight: 400; color: #8a382c; background: #f5f5f5; text-align: center; box-sizing:border-box;}
.red05-inner table tr th.th-pos{padding-top: 43px; background: #f5f5f5; position: relative; text-align: center;}
.red05-inner table tr th.th-pos img{margin-left: -78px; width: 156px; height: 156px; top: -114px; left: 50%; position: absolute; display: block;}
.red05-inner table tr th.th-pos p{font-size: 30px; line-height:1; letter-spacing:0; font-weight: bold; color: #333; padding: 25px 0;}
.red05-inner table tr td.td-icon{padding: 33px 0; text-align: center;}
.red05-inner table tr td.td-icon img{width: 100px; height: 100px; margin: 0 auto; display: block;}
.red05-inner table tr td.td-icon p{margin-top: 35px; font-size: 17px; line-height:28px; letter-spacing:0; font-weight: 400; color: #666;}
.red05-inner table tr td.td-icon p b{font-weight: bold; color: #333;}
.red05-inner table tr td.td-icon p.m2{margin-top: 20px;}
.red05-inner table tr td.td-bg{padding: 44px 0; text-align: center;}
.red05-inner table tr td.td-bg p{font-size: 20px; width: 153px; height: 153px; line-height:153px; letter-spacing:0; font-weight: bold; color: #333; background: url(../images/red/red05-tbl-bg01.png) center center no-repeat; background-size: cover; margin: 0 auto;}
/* red05 */

/* red06 */
.red06-wrap{width: 100%; max-width:1800px; margin: 0 auto 60px;}
.red06-bg{height: 875px; background: url(../images/red/red06-bg.jpg) center center no-repeat; background-size: cover;}
.red06-inner{ text-align: center;}
.red06-tit{padding: 105px 0 40px;}
.red06-tit p{font-size: 40px; line-height: 1; letter-spacing:0; font-weight: bold; color: #fff;}
.red06-tit i{width: 30px; height: 2px; margin: 20px auto 15px; font-style: normal; display: block; background: #fff;}
.red06-tit span{font-size: 19px; line-height:30px; letter-spacing:0; font-weight: 400; color: #fff; display: block;}
.red06-in {width: 1200px; margin: 0 auto;}
.red06-in > div{width: 33%; height: 526px; float: left; box-sizing:border-box; font-size: 0;}
.red06-in > div:nth-of-type(2){width: 34%;}
.red06-in > div img{margin-bottom: 30px; width: 220px; height: 220px; display: inline-block; vertical-align:top;}
.red06-in > div p{font-size: 25px; line-height:32px; letter-spacing:0; font-weight: 500; color: #333;}
.red06-in > div strong{font-size: 20px; line-height:32px; letter-spacing:0; font-weight: 400; color: #8a382c; display: block;}
.red06-in > div .bar{width: 30px; height: 2px; margin: 15px auto 15px; font-style: normal; display: block; background: #ddd;}
.red06-in > div span{ font-size: 17px; line-height:28px; letter-spacing:0; font-weight: 400; color: #666; display: block;}
/* red06 */

/* red07 */
.red07-wrap{}
.red07-inner{width: 100%; max-width:1200px; margin: 0 auto 250px; position: relative; text-align: center;}
.red07-inner::after{top: 770px; left: 50%; width: 1px; height: 70px; background: #ccc; position: absolute; content:""; display: block;}
.red07-inner > img{margin-bottom: 15px; height: 635px; width: 100%; display: block;}
.red07-inner > p{font-size: 19px; line-height:30px; letter-spacing:0; font-weight: 400; color: #333;}
.red07-in{height: 859px; margin-top: 130px; background: url(../images/red/red07-bg.png) center center no-repeat; background-size: cover;}
.red07-in .red07-tit01{font-size: 40px; line-height:1; letter-spacing:0; font-weight: 400; color: #333; display: inline-block; vertical-align:top;}
.red07-in .red07-tit02{margin-top: 40px; font-size: 80px; line-height:60px; letter-spacing:0; font-weight: 400; color: #333;}
.red07-in .bar{width: 30px; height: 2px; background: #8a382c; display: block; margin: 48px auto 40px;}
.red07-in .red07-txt01{font-size: 19px; line-height:38px; letter-spacing:0; font-weight: 400; color: #333; margin-bottom: 30px; display: block;}
.red07-in .red07-txt02{font-size: 17px; line-height:32px; letter-spacing:0; font-weight: 400; color: #666; display: block;}
.red07-in > img{margin: 40px auto 40px; width: 44px; height: 44px; display: block;}
.red07-in .red07-txt03{font-size: 19px; line-height:32px; letter-spacing:0; font-weight: 400; color: #333; display: block;}
.red07-in .red07-txt03 b{margin-top: 5px; font-size: 30px; font-weight: 500; color: #8a382c; display: block;}
/* red07 */
</style>

<body>
<!-- skip-link -->
<a href="#dBody" id="skip-link">본문 바로가기</a>
<!-- //skip-link -->

<!-- wrap -->
<div id="wrap">

	<!-- dHead -->
	<%@ include file="/WEB-INF/jsp/company/include/companyheader.jsp"%>
	<!--// dHead -->

	<section id="dBody" class="franchisee">
		<!-- page-title -->
		<div class="page-title">
			<div class="visual" style="background-image:url('../images/content/sub_visual_03.jpg');"></div>
			<h2 class="h2-type">포메인 RED</h2>
			<span class="txt">소자본 쌀국수 창업 프랜차이즈의 새로운 패러다임을 제시합니다.</span>
		</div>
		<!-- //page-title -->

		<%@ include file="/WEB-INF/jsp/company/include/companyMenuHead.jsp"%>

		<div id="contents" class="content">
			<div class="red-con">
				<div class="con-title">
					<!-- 20190225 수정 -->
					<h3 class="h3-type">포메인 RED</h3>
					<p class="n-txt"><b>R</b>ice noodle <b>E</b>xpress <b>D</b>elivery</p>
					<!-- //20190225 수정 -->
				</div>
				<div class="inner02 mt80">
					<div class="red01-wrap">
						<div class="red01-inner">
							<img src="../images/red/phomein-brown.png" alt="phomein">
							<p>소자본 쌀국수 창업 프랜차이즈의<br/>새로운 패러다임을 제시합니다.</p>
							<span>㈜데일리킹은 2006년 설립되어 국내에 쌀국수 프랜차이즈 브랜드 ‘포메인’을 정착시키고,<br/>베트남 요리 외식 문화를 대중화시킨 법인 기업입니다.<br/>또한 변화하는 트렌드와 시장 환경에 맞춰 소자본 창업 브랜드 ‘포메인 RED’를 런칭하였습니다.<br/><br/>투명한 경영방침으로 13년 동안 ‘포메인’을 운영해온 프랜차이즈 전문 기업 ㈜데일리킹이 만든 브랜드로<br/>업계 1위 장수 브랜드의 노하우와 견고한 운영체계가 결집된 ‘확실한 경쟁력’을 보장합니다.</span>
						</div>
					</div>
					<div class="red02-wrap red02-bg">
						<div class="red02-inner">
							<div class="red02-tit">
								<p>DAILYKING INC</p>
							</div>
							<div class="red02-in clear">
								<div class="r-box">
									<img src="../images/red/phomein-green.png" alt="phomein" class="img-pos">
									<p class="r-tit">포메인</p>
									<span class="r-bar"></span>
									<img src="../images/red/restaurant-icon.png" alt="레스토랑형" class="img-icon">
									<p class="r-name">레스토랑형</p>
									<span class="r-txt">(1.5~2억 / 30평~)</span>
								</div>
								<div class="r-box">
									<img src="../images/red/phomein-brown.png" alt="phomein" class="img-pos">
									<p class="r-tit">포메인 R.E.D</p>
									<span class="r-bar"></span>
									<img src="../images/red/express-icon.png" alt="익스프레스형" class="img-icon">
									<p class="r-name">익스프레스형</p>
									<span class="r-txt">(1억 / 10~15평)</span>
								</div>
							</div>
						</div>
					</div>
					<div class="red03-wrap red03-bg">
						<div class="red03-inner">
							<div class="red03-tit">
								<p>프리미엄 소규모 쌀국수 브랜드, 포메인 RED</p>
								<i></i>
								<span>포메인 RED는 변화하는 외식업 시장 트렌드 선점과<br/>부부 창업, 초보자 창업을 핵심 동력으로한 브랜드입니다.</span>
							</div>
							<div class="red03-in clear">
								<div class="red03-box">
									<img src="../images/red/red03-icon01.png" alt="소자본 1억 창업">
									<p>소자본 1억 창업</p>
									<i class="bar"></i>
									<span>국내 프랜차이즈 평균 창업비용 대비<br/>
									<b>약 15% 낮은 비용</b>으로<br/>
									창업 비용 부담을 줄였습니다.</span>
									<strong>※ 2015년도 통계청 통계플러스(KOSTAT)<br/><i></i>프랜차이즈 현황 자료 발췌</strong>
								</div>
								<div class="red03-box">
									<img src="../images/red/red03-icon02.png" alt="안정적인 수익률">
									<p>안정적인 수익률</p>
									<i class="bar"></i>
									<span>국내 프랜차이즈 평균 대비<br/>
									<b>약 242% 이상의 높은 기대수익률</b>과<br/>
									매출 대비 <b>안정적인 수익률을 창출</b>합니다.</span>
									<strong>※ 2015년도 통계청 통계플러스(KOSTAT)<br/><i></i>프랜차이즈 현황 자료 발췌</strong>
									<strong>※ 점주 상주 및 총 매출액(3천 만원) 대비<br/><i></i>딜리버리 매출 30% 가정 </strong>
								</div>
								<div class="red03-box">
									<img src="../images/red/red03-icon03.png" alt="딜리버리 특화">
									<p>딜리버리 특화</p>
									<i class="bar"></i>
									<span><b>2015년 업계 최초 딜리버리서비스<br/>
									도입</b>으로 쌓은 쌀국수 포장·딜리버리에 대한<br/>노하우와 수 차례 연구로 개발한<br/>특허 받은 패키지로 꾸준한 매출 상승세와<br/>신규 고객을 창출합니다.</span>
								</div>
							</div>
						</div>
					</div>
					<div class="red04-wrap">
						<div class="red04-inner clear">
							<div class="red04-left">
								<p>포메인 RED,<br/>트렌드에 녹여낸 13년 노하우</p>
								<span>메뉴 개발, 인테리어, 입지 선정 등 더욱 엄격해진 기준과<br/>
								프랜차이즈 브랜드 13년 운영 노하우를 뒷받침으로<br/>
								가맹점주님들의 성공적인 미래를 준비합니다.</span>
							</div>
							<div class="red04-right">
								<img src="../images/red/red04-bg02.jpg" alt="포메인">
							</div>
						</div>
					</div>
					<div class="red05-wrap">
						<div class="red05-inner">
							<table>
								<colgroup>
									<col width="35%">
									<col width="30%">
									<col width="35%">
								</colgroup>
								<thead>
									<tr>
										<th class="th-pos">
											<img src="../images/red/red05-top-img01.png" alt="기존저가 소형업체">
											<p>기존 저가·소형 업체</p>
										</th>
										<th class="th-cen">VS</th>
										<th class="th-pos">
											<img src="../images/red/red05-top-img02.png" alt="포메인 RED">
											<p>포메인 RED</p>
										</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img01.png" alt="아이콘">
											<p>신생 기업으로 파악 불가</p>
										</td>
										<td class="td-bg">
											<p>본사 경쟁력</p>
										</td>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img02.png" alt="아이콘">
											<p class="m2">프랜차이즈 브랜드 ‘포메인’ 보유<br/><b>13년 운영 업력</b></p>
										</td>
									</tr>
									<tr>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img03.png" alt="아이콘">
											<p>태국·베트남 수입산 쌀국수면</p>
										</td>
										<td class="td-bg">
											<p>쌀국수면</p>
										</td>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img04.png" alt="아이콘">
											<p class="m2">베트남 법인 쌀국수 공장 ‘포시즌’<br/><b>자가제면 햅쌀 쌀국수면</b></p>
										</td>
									</tr>
									<tr>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img05.png" alt="아이콘">
											<p>액상 스프·분말·과립형 제품 혼용</p>
										</td>
										<td class="td-bg">
											<p>육수</p>
										</td>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img06.png" alt="아이콘">
											<p class="m2"><b>9가지 상급 천연 향신료</b>로 만든 ‘Herb-Bags’과<br/><b>호주산 청정우</b> 사용하여 14시간 끓여내 사용</p>
										</td>
									</tr>
									<tr>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img07.png" alt="아이콘">
											<p>분식집 스타일</p>
										</td>
										<td class="td-bg">
											<p>인테리어</p>
										</td>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img08.png" alt="아이콘">
											<p class="m2"><b>모던함과 팔각 오브제의 오리엔탈함</b>이<br/>믹스된 이색 공간 연출</p>
										</td>
									</tr>
									<tr>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img09.png" alt="아이콘">
											<p>전무하거나 창업 모집 광고</p>
										</td>
										<td class="td-bg">
											<p>언론 홍보</p>
										</td>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img10.png" alt="아이콘">
											<p class="m2">메뉴 홍보, 브랜드 기획기사 등<br/><b>주기적인 보도자료 배포</b></p>
										</td>
									</tr>
									<tr>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img11.png" alt="아이콘">
											<p>공식 SNS 채널 X</p>
										</td>
										<td class="td-bg">
											<p>SNS</p>
										</td>
										<td class="td-icon">
											<img src="../images/red/red05-tbl-img12.png" alt="아이콘">
											<p class="m2"><b>공식 SNS 채널 3개 보유</b><br/>(블로그, 페이스북, 인스타그램)</p>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="red06-wrap red06-bg">
						<div class="red06-inner">
							<div class="red06-tit">
								<p>포메인 RED, 맛과 품질로 쌓은 브랜드 파워</p>
								<i></i>
								<span>포메인 RED는 번거로운 작업 환경을 개선한 최적화된 시스템으로<br/>오직 쌀국수 연구에만 집중할 수 있는 환경을 구축하였습니다. <br/>또한 보이지 않는 곳에서 변화를 주도해온 장인의 철학처럼<br/>쌀국수의 품격과 미래 비전을 제시합니다.</span>
							</div>
							<div class="red06-in clear">
								<div class="red06-box">
									<img src="../images/red/red06-icon01.png" alt="사진">
									<p>현대그린푸드</p>
									<strong>‘안전한 식자재 공급’ MOU</strong>
									<i class="bar"></i>
									<span>‘위해상품 차단 시스템’을 갖춘<br/>
									종합식품기업 ‘현대그린푸드’와<br/>
									업무협약을 체결하여 각 가맹점에<br/>
									안전한 식자재를 공급합니다.</span>
								</div>
								<div class="red06-box">
									<img src="../images/red/red06-icon02.png" alt="사진">
									<p>베트남 현지 법인</p>
									<strong>쌀국수 공장 포시즌(PHO SEASON)</strong>
									<i class="bar"></i>
									<span>‘안전한 식재료 정직한 먹거리’라는<br/>
									이념아래 포시즌(PHO SEASON)을 설립,<br/>
									독자적인 연구개발로 쌀국수면과<br/>
									육수용 허브백(Herb-Bags)을 자체 생산합니다.</span>
								</div>
								<div class="red06-box">
									<img src="../images/red/red06-icon03.png" alt="사진">
									<p>국내 브랜드 유일</p>
									<strong>햅쌀로 만든 ‘햅쌀 쌀국수면’</strong>
									<i class="bar"></i>
									<span>묵은쌀로 만든 수입 쌀국수면에 의존한<br/>
									쌀국수 시장에서 햅쌀로 자가제면한<br/>
									‘햅쌀 쌀국수면’은 브랜드 파워인 동시에<br/>
									고객 약속의 결실입니다.</span>
								</div>
							</div>
						</div>
					</div>
					<div class="red07-wrap">
						<div class="red07-inner">
							<img src="../images/red/red07-img.png" alt="사진">
							<p>베트남 쌀국수 대표 브랜드 ‘포메인’을 운영해온 ㈜데일리킹은<br/>
							13년 전을 거슬러 현재를 보는 안목과 변치 않는 초심으로 <br/>
							다가올 10년을 향해 도약하고자 합니다.</p>
							<div class="red07-in">
								<p class="red07-tit01">名品 쌀국수</p>
								<h4 class="red07-tit02">포메인 RED</h4>
								<i class="bar"></i>
								<span class="red07-txt01">수많은 외식 브랜드가 범람하는 환경에서<br/>
								‘쌀국수’만은 최고라는 ‘자부심’과 ‘名品 쌀국수’를 연구하는 ‘장인정신’으로<br/>포메인 RED의 역사와 미래를 함께 하실 또 한 분의 가족을 모십니다.</span>
								<span class="red07-txt02">기타 자세한 내용은 문의 부탁드립니다.</span>
								<img src="../images/red/red07-service.png" alt="고객센터">
								<span class="red07-txt03">가맹점 상담문의<br/><b>031.780.1510~1</b></span>
							</div>
						</div>						
					</div>
				</div>
			</div>
		</div>
		<!-- //contents -->

	</section>
	<!--// dBody -->

	<!-- dFoot -->
	<%@ include file="/WEB-INF/jsp/company/include/companyfooter.jsp"%>
	<!--// dFoot -->

</div>

<script src="../common/js/front_ui.js"></script>
<script>
$(function(){
	$('.slider-for').slick({
		slidesToShow: 1,
		slidesToScroll: 1,
		arrows: false,
		fade: true,
	});

	$('.slider-in').slick({
		slidesToShow: 1,
		slidesToScroll: 1,
		infinite: false,
		fade: true,
		dots: true
	});

	$('.slider-nav').slick({
		slidesToShow: 4,
		slidesToScroll: 1,
		asNavFor: '.slider-for',
		infinite: false,
		dots: true,
		focusOnSelect: true
	});

	$('.slider-nav .slick-prev').click(function() {
		progressbar();
		return false;
	});

	$('.slider-nav .slick-next').click(function() {
		progressbar();
		return false;
	});

	$('.slider-nav .slick-slide').click(function() {
		progressbar();
		return false;
	});

	var bar = $('.slider-progress .progress'),
		active = $('.slider-nav .slick-dots .slick-active'),
		w = active.width();

	bar.css({width: w+'px'});

	function progressbar() {
		var x = $('.slider-nav .slick-dots .slick-active').position();
		var n = x.left+w;
		bar.animate({
			width: n+'px'
		});
	}
});
</script>
</body>
</html>
