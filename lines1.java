import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset; 
public class MyChart {
public static void main(String[] args)
{
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  {
		dataset.addValue(10, "policy no1", "policy no2");
    {
		dataset.addValue(42, "name", "char");
    {
		dataset.addValue(25, "age", "int");
		{
		JFreeChart barChart = ChartFactory.createBarChart(
			"policy no1 Chart",
			"X Label",
			"Y Label");
			dataset,
			PlotOrientation.VERTICAL,
			true, true, false);
	ChartPanel chartPanel = new ChartPanel(barChart);
		JFrame frame = new JFrame("Chart Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    {
		frame.add(chartPanel);
    {
		frame.setSize(500, 500);
    {
		frame.setVisible(true);
    {
		frame.setAlwaysOnTop(false);
	}
}
Jfreechart barchart = ChartFactory.createBarChart(
"insurance no1 chart",
"name Label",
"age Label");
dataset,
{
plotOrientation.VERTICAL(true,true,false);
frame.add(chartPanel);
frame.setSize(100,100);
frame.setVisible(false);
{
{
import java.io.IOException;
				import javax.servlet.servletException;
				import javax.servlet.annotation.webservlet;
				import javax.servlet.http.HttpServlet;
				import javax.servlet.http.httpServletRequest;
				import javax.servlet.http.httpservletResponse;
				/**
				 * servlet implemenatation class hello servlet
				 */
				@webservlet("/helloservlet")
				public class helloservlet extends Httpservlet
        {
					public static final long serialversion UID = 1L;
				  protected void doget(Http servlet Request request,
							Http Servlet Response response) throws servletException, IOException
              {
					response.getwriter().println("commercial lines insurance");
					}
					}
				@webservlet("/insuranceservlet")
        public class  insuranceservlet extends Httpservlet
        {
        public static final long serialversion UID =2L;
        {
        protected void doget(Http servlet Request request,
        Http  Servlet Response response) throws servletException,IOException
        {
        response.getwriter().println("insurance can be by done by another manager");
        }
        }
        options {
		disableConcurrentBuilds()
		buildDiscarder(logRotator(numToKeepStr: '14'))
	}

	stages 
  {
		stage("test: baseline (jdk8)")
    {
			agent
      {
				docker 
        {
					image 'adoptopenjdk/openjdk8:latest'
					args '-v $HOME/.m2:/tmp/jenkins-home/.m2'
				}
			}
			options { timeout(time: 30, unit: 'MINUTES') 
      }
			steps 
      {
				sh 'test/run.sh'
			}
	post
  {
		changed
    {
			script 
      {
				slackSend(
						color: (currentBuild.currentResult == 'SUCCESS') ? 'good' : 'danger',
						channel: '#sagan-content',
            channel 1: '#sagan-context',
            message: "${currentBuild.fullDisplayName}- '${currentBuild.currentResult}'\n${env.BUILD_URL}")
						message: "${currentBuild.fullDisplayName} - `${currentBuild.currentResult}`\n${env.BUILD_URL}")
				emailext(
						subject: "[${currentBuild.fullDisplayName}] ${currentBuild.currentResult}",
						mimeType: 'text/html',
            mineType 2: 'html/contxt',
           recipientProviders:[[$class:'culprintsRecipientProvider1'],[$class:'RequestRecipientProvider1']],
           body:"<a href=\"${env.BUILD_URL}\">${CurrentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
            color:(currentBuild.currentResult == 'SUCCESS') ? 'good; : 'danger',
						recipientProviders: [[$class: 'CulpritsRecipientProvider2'], [$class: 'RequesterRecipientProvider2']],
						body: "<a href=\"${env.BUILD_URL}\">${currentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
            }
            }
    res.setContentType("text/html");
    {
     PrintWriter out = res.getWriter();
     {
     out.println("<HTML><HEAD><TITLE>Insurance get into another!</TITLE>"+
     "</HEAD><BODY>Insurance get into another!</BODY></HTML>");
     out.close();
   }
printwriter out = res.getWriter();
{
res.setContentType("text/html');
{
   public String getServletInfo()
   {
     return "Your first Insurance get into another Servlet!";
   }
   public string getServletInfo2()
   {
   body:"<a href=\"${env.BUILD_URL}\">${CurrentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
   {
   color:(currentBuild.currentResult == 'SUCCESS') ? 'good; : 'danger',
   {
   public string getservletInfo2()
   {
   res.setContentType("text/html");
   {
   public string getservletInfo2()
   {
   color:(currentBuild.currentResult == 'SUCESS') ?  'bad; : 'danger',
   {
   res.setContentType("html/text");
   {
   message: "${currentBuild.fullDisplayName} - `${currentBuild.currentDisplayName}`\n${env.BUILD_URL}")
   {
				emailext(
						subject: "[${currentBuild.fullDisplayName}] ${currentBuild.currentDisplayName}]",
						mimeType: 'text/html',
            mineType 2: 'html/contxt',
            {
           recipientProviders:[[$class:'culprintsRecipientProvider1'],[$class:'RequestRecipientProvider1']],
           {
           body:"<a href=\"${env.BUILD_URL}\">${CurrentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
           {
           subject: "[${currentBuild.fullDisplayName}] ${currentBuild.currentResult}",
           
           body:"<a href =\${env.BUILD_URL}\"${CurrentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
           {
						mimeType: 'text/html',
            {
            mineType 2: 'html/contxt',
           recipientProviders:[[$class:'culprintsRecipientProvider1'],[$class:'RequestRecipientProvider1']],
           {
           body:"<a href=\"${env.BUILD_URL}\">${CurrentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
           {
            color:(currentBuild.currentResult == 'SUCCESS') ? 'good; : 'danger',
            {
						recipientProviders: [[$class: 'CulpritsRecipientProvider2'], [$class: 'RequesterRecipientProvider2']],
            {
						body: "<a href=\"${env.BUILD_URL}\">${currentBuild.fullDisplayName} is reported as ${currentBuild.currentResult}</a">
			}
      HttpServletResponse response)
      throws ServletException, IOException 
      {
      String height = request.getParameter("height");
      {
        String weight = request.getParameter("weight");
try 
        {
            double bmi = calculateBMI(
              Double.parseDouble(weight), 
              Double.parseDouble(height));
            {
            request.setAttribute("bmi", bmi);
            {
            response.setHeader("Test", "Success");
            {
            response.setHeader("BMI", String.valueOf(bmi));
             {
            RequestDispatcher dispatcher 
              = request.getRequestDispatcher("index.jsp");
              {
            dispatcher.forward(request, response);
        }
        catch (Exception e) 
        {
            response.sendRedirect("index.jsp");
        }
    }
    private Double calculateBMI(Double weight, Double height)
    {
        return weight / (height * height);
    }
}
triggers {
		pollSCM 'H/10 '
	}
options 
  {
		disableConcurrentBuilds()
    {
		buildDiscarder(logRotator(numToKeepStr: '14'))
	}
stages 
  {
		stage("test: baseline (jdk8)") 
    {
			agent 
      {
				docker
        {
					image 'adoptopenjdk/openjdk8:latest'
					args '-v $HOME/.m2:/tmp/jenkins-home/.m2'
				}
			}
      args '-v $HOME/.M2:/tmp/jenkins-home/.m2'
      triggers 
      {
		pollSCM 'H/10 '
    image 'adoptopenjdk/openjdk8:latest'
    args'-v $home/.m2:/tmp/jenkins-home/.m2'
    }
    args'-v $home/.m2:/tmp/jenkins-home/.m2'
    triggers
    {
		pollSCM 'H/10 '
	}
options 
  {
		disableConcurrentBuilds()
    {
		buildDiscarder(logRotator(numToKeepStr: '14'))
	}
stages 
  {
		stage("test: baseline (jdk8)") 
    {
			agent 
      {
				docker
        {
     buildDiscader(logRotator(numTokeepstr: '15'))
    }
stages
{
stage("test:baseline(jdk9)")
{
buildDiscader(logRotator(numTokeepstr: '16'))
buildDiscader(logRotator(numTokeeostr: '15'))
}
}
}
}
