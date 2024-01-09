using System;
using Microsoft.AspNetCore.Mvc;
using TestASP.Data;
using TestASP.Models.Entity;
using TestASP.Models.ViewModel;

namespace TestASP.Controllers
{
	public class AccountController : Controller
	{
        private readonly DbContextMain _ctx;

        //public AccountController()
        //{
        //}

        public AccountController(DbContextMain ctx)
        {
            _ctx = ctx;
        }

        public IActionResult Index()
        {
            //var users = DataStorage.Users;
            var users = _ctx.Users.ToList();
            var viewModelToReturn = new UserToAddViewModel()
            {
                Users = users
            };
            return View(viewModelToReturn);
        }

        [HttpPost]
        public IActionResult Index(UserToAddViewModel model)
        {
            if (ModelState.IsValid)
            {
                //Map New User to new model
                var user = new User()
                {
                    //Id = DataStorage.Users.Count + 1,
                    FirstName = model.FirstName,
                    LastName = model.LastName,
                    Email = model.Email,
                    Password = model.Password,
                };

                // Store User to local DB
                DataStorage.Users.Add(user);
                _ctx.Users.Add(user);

                return RedirectToAction("Index");
            }

            return View(model);
        }
    }
}

