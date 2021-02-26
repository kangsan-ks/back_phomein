<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<header id="dHead" class="">
		<!-- header_wrap -->
		<div class="header-wrap">
			<div class="inner">
				<h1><a href="/company/main/main.do">DAILYKING</a></h1>
				<nav id="gnb">
					<ul>
						<li>
							<a href="/company/company/dailyking.do">회사소개</a>
							<ul>
								<li><a href="/company/company/dailyking.do">(주)데일리킹</a></li>
								<li><a href="/company/company/phomein.do">포메인</a></li>
<!-- 								<li><a href="/company/company/	brownsugar.do">패밀리 브랜드</a></li> -->
								<li><a href="/company/company/ceo.do">CEO 인사말</a></li>
								<li><a href="/company/company/location.do">오시는 길</a></li>
							</ul>
						</li>
						<li>
							<a href="/company/rnd/phoseason.do">연구개발</a>
							<ul>
								<li><a href="/company/rnd/phoseason.do">포시즌</a></li>
								<li><a href="/company/rnd/greenfood.do">현대그린푸드 MOU</a></li>
								<li><a href="/company/rnd/educ.do">전문 교육장</a></li>
							</ul>
						</li>
						<li>
							<a href="/company/franchisee/step01.do">가맹개설정보</a>
							<ul>
								<li><a href="/company/franchisee/step01.do">가맹 안내</a></li>
								<li><a href="/company/franchisee/red.do">포메인 RED</a></li>
								<!-- <li><a href="/company/franchisee/estimate.do">가맹 비용</a></li> -->
								<li><a href="/company/franchisee/interior.do">인테리어</a></li>
								<li><a href="/company/franchisee/interview.do">우수매장</a></li>
								<li><a href="/company/franchisee/terms.do">가맹 상담 신청</a></li>
							</ul>
						</li>
						<li>
							<a href="/company/csr/phoever.do">사회공헌</a>
							<ul>
								<li><a href="/company/csr/phoever.do">CSR</a></li>
							</ul>
						</li>
					</ul>
				</nav>
				<div class="btn-franchisee">
					<a href="/brand/main/main.do" target="_self">브랜드</a>
				</div>
				<div class="btn-system2">
				<a href="/admin/login.do">포메인 시스템</a>
			</div>
			</div>

			<!-- btn-country -->
			<div class="btn-country">
				<a href="#">country</a>
				<div class="list">
					<ul>
						<li><a href="/company/main/main.do">KOR</a></li>
						<li><a href="/eng/main/main.do">ENG</a></li>
						<li><a href="/jpn/main/main.do">JPN</a></li>
					</ul>
				</div>
			</div>
			<!-- //btn-country -->

			<!-- btn-system -->
			<div class="btn-system">
				<a href="/admin/login.do">포메인 시스템</a>
			</div>
			<!-- //btn-system -->
		</div>
		<!-- //header_wrap -->
	</header>


<script>
	$(document).ready(function () {
		var url = $(location).attr("pathname");
		$("#gnb" ).each(function( index ) {
			$(this).find('ul li a').each(function(index) {
				if($(this).attr("href") == url){
					var $this = $(this);

					if($(this).parent("li").css("display") == "none") {
						var $text = $(this).text();
						$(this).parent("li").parent("ul").find("li a").each(function(index) {
							if($text == $(this).text()) {
								$(this).parent("li").attr("class", "actived");
								return false;
							}
						});
					} else {
						$this.parent("li").attr("class", "actived");
					}
				}
			});
		});
	});
</script>
