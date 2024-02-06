using DemoAppMvc.Models;
using Microsoft.AspNetCore.Mvc;

namespace DemoAppMVC.Controllers
{
    public class StaffController : Controller
    {
        private static List<Staff> staffList = new List<Staff>();
        static int index = 1;
        public IActionResult Index()
        {
            ViewBag.Header = "Staff Page";
            return View();
        }


        [HttpPost]
        public IActionResult Create(string FirstName, string LastName, int Age)
        {
            Staff s = new Staff()
            { Id = index++, FirstName = FirstName, LastName = LastName, Age = Age };
            staffList.Add(s);
            return RedirectToAction("List");
        }

        public IActionResult Create()
        {
            ViewBag.Header = "Create Staff";
            return View();
        }

        public IActionResult List()
        {
            ViewBag.Header = "Staff List Page";
            return View(staffList);
        }

        public IActionResult View(int id)
        {
            Staff st = new Staff();
            foreach(Staff staff in staffList)
            {
                if (st.Id == id)
                {
                    st = staff;
                    break;
                }
            }
            return View(st);
        }

    }
}