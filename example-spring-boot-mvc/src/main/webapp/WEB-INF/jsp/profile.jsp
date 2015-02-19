<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Handing Form Submission</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<link rel="stylesheet" href="css/templatemo_main.css"></link>
</head>
<body>
	<div id="main-wrapper">
		<!--[if lt IE 7]>
                <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
            <![endif]-->

		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 affix text-center"
			style="z-index: 1;">
			<h1 class="templatemo-site-title">
				<a href="" rel="nofollow">Candidate Management System</a> <img
					src="images/btn-menu.png" alt="main menu" id="m-btn"
					class="pull-right visible-xs visible-sm"></img>
			</h1>

			<ul id="responsive" style="display: none" class="hidden-lg hidden-md"></ul>
			<!-- /.responsive -->
		</div>

		<div class="menu visible-md visible-lg">
			<ul id="menu-list">
				<li class="active home-menu"><a href="#home">Home</a></li>
				<li class="about-menu"><a href="#about">Login</a></li>
				<li class="services-menu"><a href="#services">Our Services</a></li>
				<li class="testimonial-menu"><a href="#testimonial">Testimonials</a></li>
				<li class="contact-menu"><a href="#contact">Contact</a></li>
			</ul>
		</div>
		<!-- /.menu -->

		<div class="image-section">
			<div class="image-container">
				<img src="images/nature1.jpg" id="home-img"
					class="main-img inactive" alt="Home"> </img><img
					src="images/nature2.jpg" id="about-img" class="inactive"
					alt="About"> </img><img src="images/nature3.jpg" id="services-img"
					class="inactive" alt="Services"></img> <img
					src="images/nature4.jpg" id="testimonial-img" class="inactive"
					alt="Testimonial"></img> <img src="images/nature5.jpg"
					id="contact-img" class="inactive" alt="Contact"></img>
			</div>
		</div>

		<div class="row">
			<div
				class="col-lg-6 col-md-6 col-sm-12 col-xs-12 col-lg-offset-6 col-md-offset-6 templatemo-content-wrapper">
				<div class="templatemo-content">

					<section id="home-text" class="active templatemo-content-section">
						<div class="col-sm-12 col-md-12 col-lg-12">
							<h2>Welcome to Soft CMS System</h2>
							<p>
							<form action="#" th:action="/user_list.html" method="post">



							</form>
							</p>

						</div>
					</section>
					<!-- /.home-text -->

					<section id="about-text" class="inactive">
						<h2 class="text-center">About Us</h2>
						<div class="col-sm-6 col-md-6">
							<p>Login</p>
							<form th:action="@{/login}" method="post">
								xmlns:th="http://www.thymeleaf.org"
								<div>
									<label> User Name : <input type="text" name="username" />
									</label>
								</div>
								<div>
									<label> Password: <input type="password"
										name="password" />
									</label>
								</div>
								<div>
									<input type="submit" value="Sign In" />
								</div>
							</form>
						</div>
						<div class="col-sm-6 col-md-6">
							<p>Registration</p>
							<form th:action="@{/login}" method="post">
								<div>
									<label> User Name : <input type="text" name="username" />
									</label>
								</div>
								<div>
									<label> Password: <input type="password"
										name="password" />
									</label>
								</div>
								<div>
									<label> Confirm Password: <input type="password"
										name="password" />
									</label>
								</div>
								<div>
									<input type="submit" value="Sign In" />
								</div>
							</form>
						</div>
					</section>
					<!-- /.about-text -->

					<section id="services-text" class="inactive">
						<h2 class="text-center">Candidate Profile Entry</h2>
						<p>
							<br /> <br />
						</p>
						<form action="#" th:action="/user_list.html" method="post" enctype="multipart/form-data">
							<div class="col-sm-4 col-md-4">
								<!-- 								<h3>Web Design</h3> -->
								<br/>
								<p>
									Department : <select name="department">
										<option value="R">R&D</option>
										<option value="S">Systems</option>
										<option value="W">Windows</option>
										<option value="I">IPTelephony</option>
										<option value="N">Networks</option>
										<option value="Q">QA</option>
									</select>
								</p>
								</p>
								<p>
									candidate Name: <input type="text" name="name" />
								</p>
							</div>
							<div class="col-sm-4 col-md-4">
								<p>
									Current Company: <input type="text" name="company" />
								</p>

								<p>
									Experience: <input type="text" name="experience" />
								</p>
							</div>
							<div class="col-sm-4 col-md-4">
								<p>
									Highest Qualification : <select name="qualification">
										<option value="M">MS/M.Tech.</option>
										<option value="B">MCA/M.Sc./B.Tech</option>
										<option value="O">Other(BCA/B.Sc.)</option>
									</select>
								</p> 
								<p>
									College : <input type="text" name="college" />
								</p>
							</div>
							<div class="col-sm-4 col-md-4">
								<p>
									Select Resume: <input type="file" name="resume" />
								</p>								
								<p>
									<input type="submit" value="Submit" />
								</p>
							</div>
						</form>
					</section>
					<!-- /.services-text -->

					<section id="testimonial-text" class="inactive">
						<div class="col-sm-12 col-md-12">
							<h2>Testimonials</h2>
							<p>Aenean quis semper metus. Maecenas adipiscing, leo a
								facilisis tempor, mi quam feugiat eros, ullamcorper porttitor
								elit turpis ac risus. Lorem ipsum dolor sit amet, consectetur
								adipiscing elit. Suspendisse non sem a leo mattis dapibus. Duis
								vel ornare arcu. Quisque at malesuada tortor.</p>
							<p>Quisque non tempus lacus, non placerat arcu. Donec nibh
								ipsum, pharetra nec pellentesque at, mattis ut lorem. Fusce
								dapibus tristique neque, eget ultricies lorem tincidunt vitae.
								Aliquam erat volutpat. Integer vulputate ultricies nisl, sed
								vehicula justo accumsan non.</p>
						</div>
					</section>
					<!-- /.testimonial-text -->

					<section id="contact-text" class="inactive">
						<div class="col-sm-12 col-md-12">
							<div class="row">
								<div class="col-sm-12 col-md-12">
									<h2>Contact</h2>
								</div>
								<div class="clearfix"></div>
							</div>

							<div class="row">
								<div class="col-sm-6 col-md-6">
									<div id="map-canvas"></div>
									<p>5th Floor, Voyager, Pattandur Agrahara, Whitefield,
										Bangalore, Karnataka 560066</p>
								</div>

								<div class="col-sm-6 col-md-6">
									<form action="#" method="post">

										<div class="form-group">
											<!--<label for="contact_name">Name:</label>-->
											<input type="text" id="contact_name" class="form-control"
												placeholder="Name" />
										</div>
										<div class="form-group">
											<!--<label for="contact_email">Email:</label>-->
											<input type="text" id="contact_email" class="form-control"
												placeholder="Email Address" />
										</div>
										<div class="form-group">
											<!--<label for="contact_message">Message:</label>-->
											<textarea id="contact_message" class="form-control" rows="9"
												placeholder="Write a message"></textarea>
										</div>
										<button type="submit" class="btn btn-primary">Send</button>

									</form>
								</div>

								<div class="clearfix"></div>
							</div>
						</div>
					</section>
					<!-- /.contact-text -->
				</div>
				<!-- /.templatemo-content -->
			</div>
			<!-- /.templatemo-content-wrapper -->
		</div>
		<!-- /.row -->

		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 footer">
				<p class="footer-text">
					Copyright &copy; 2014 <a href="http://www. t.com.">Soft</a>
				</p>
			</div>
			<!-- /.footer -->
		</div>

	</div>
	<!-- /#main-wrapper -->

	<div id="preloader">
		<div id="status">&nbsp;</div>
	</div>
	<!-- /#preloader -->
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.backstretch.min.js"></script>
	<script src="js/templatemo_script.js"></script>
</body>
</html>