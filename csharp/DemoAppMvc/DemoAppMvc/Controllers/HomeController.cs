    using DemoAppMvc.Models;
    using Microsoft.AspNetCore.Mvc;
    using System.Diagnostics;

    namespace DemoAppMVC.Controllers
    {
        public class HomeController : Controller
        {
            private readonly ILogger<HomeController> _logger;

            public HomeController(ILogger<HomeController> logger)
            {
                _logger = logger;
            }

            public IActionResult Index()
            {
                return View();
            }

            public IActionResult About()
            {
                ViewBag.Header = "About Staff";
                return View();
            }

            public IActionResult Privacy()
            {
                return View();
            }

        public IActionResult Staff()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
            public IActionResult Error()
            {
                return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
            }
        }
    }
